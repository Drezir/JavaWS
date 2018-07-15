package teams;

import javax.xml.ws.Endpoint;

public class TeamsPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/teams", new TeamsImpl());
    }
}
