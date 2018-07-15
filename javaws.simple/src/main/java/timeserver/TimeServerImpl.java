package timeserver;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import javax.jws.WebService;

@WebService(endpointInterface = "timeserver.TimeServer")
public class TimeServerImpl implements TimeServer {
    public String getTimeAsString() {
        return LocalDate.now().toString();
    }

    public long getTimeAsElapsed() {
        return DateTime.now().getMillis();
    }
}
