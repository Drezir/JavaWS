package teams;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.Collection;

@WebService
public interface Teams {
    @WebMethod Team getTeam(final String name);
    @WebMethod Collection<Team> getTeams();
}
