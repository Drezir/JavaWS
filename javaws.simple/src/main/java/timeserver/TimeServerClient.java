package timeserver;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class TimeServerClient {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://localhost:8080/ts?wsdl");
            QName qName = new QName("http://timeserver/", "TimeServerImplService");
            Service service = Service.create(url, qName);
            TimeServer eif = service.getPort(TimeServer.class);
            System.out.println(eif.getTimeAsElapsed());
            System.out.println(eif.getTimeAsString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
