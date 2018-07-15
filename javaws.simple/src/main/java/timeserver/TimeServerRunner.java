package timeserver;

import javax.xml.ws.Endpoint;

public class TimeServerRunner {
    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:8080/ts", new TimeServerImpl());
    }
}
