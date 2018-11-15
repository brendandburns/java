package io.kubernetes.client.util.credentials;

import static org.junit.Assert.fail;

import com.google.common.io.ByteStreams;
import com.google.common.io.Resources;
import io.kubernetes.client.ApiClient;
import io.kubernetes.client.util.KubeConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.net.URL;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class KubeconfigAuthenticationTest {
  @Rule public TemporaryFolder folder = new TemporaryFolder();

  @Test
  public void testCertsLoaded() {
    try {
      File subFolder = folder.newFolder();
      File config = new File(subFolder, "config");
      FileWriter writer = new FileWriter(config);

      String certConfig =
          "apiVersion: v1\n"
              + "contexts:\n"
              + "- context:\n"
              + "    user: cert-cluster\n"
              + "  name: foo-context\n"
              + "current-context: foo-context\n"
              + "users:\n"
              + "- name: cert-cluster\n"
              + "  user:\n"
              + "    client-key: client.key\n"
              + "    client-certificate: client.cert\n";
      writer.write(certConfig);
      writer.flush();
      writer.close();

      URL clientCert = Resources.getResource("clientauth.cert");
      File clientCertFile = new File(subFolder, "client.cert");
      ByteStreams.copy(clientCert.openStream(), new FileOutputStream(clientCertFile));

      URL clientKey = Resources.getResource("clientauth.key");
      File clientKeyFile = new File(subFolder, "client.key");
      ByteStreams.copy(clientKey.openStream(), new FileOutputStream(clientKeyFile));

      KubeConfig kc = KubeConfig.loadKubeConfig(config);
      KubeconfigAuthentication auth = new KubeconfigAuthentication(kc);
      final ApiClient client = new ApiClient();
      auth.provide(client);
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Unexpected exception: " + ex);
    }
  }
}
