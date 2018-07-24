package teams;

import io.undertow.Undertow;
import io.undertow.servlet.api.DeploymentInfo;
import org.jboss.resteasy.plugins.server.undertow.UndertowJaxrsServer;
import org.jboss.resteasy.spi.ResteasyDeployment;

public class RestRunner {
    public static void main(String[] args) {
        final int port = 8080;
        UndertowJaxrsServer server = new UndertowJaxrsServer();
        Undertow.Builder serverBuilder = Undertow.builder().addHttpListener(port, "0.0.0.0");
        server.start(serverBuilder);

        ResteasyDeployment restDeployment = new ResteasyDeployment();
        restDeployment.setApplication(new RestApplication());
        server.deploy(restDeployment);
    }
}
