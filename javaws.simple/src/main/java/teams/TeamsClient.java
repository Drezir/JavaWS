package teams;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class TeamsClient {
    public static void main(String[] args) {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/teams?wsdl");
            QName qName = new QName("http://teams/", "TeamsImplService");
            Service service = Service.create(url, qName);
            Teams teams = service.getPort(Teams.class);

            System.out.println("1. " + teams.getTeam("Invalid"));
            System.out.println("2. " + teams.getTeam("Chelsea"));
            teams.getTeams().forEach(System.out::println);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
