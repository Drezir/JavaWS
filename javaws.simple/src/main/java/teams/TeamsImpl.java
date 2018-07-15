package teams;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.Collection;

@WebService(endpointInterface = "teams.Teams")
public class TeamsImpl implements Teams {
    private TeamUtility utils;

    public TeamsImpl() {
        utils = new TeamUtility();
        utils.makeTestTeams();
    }

    public Team getTeam(final String name) {
        return utils.getTeam(name);
    }

    public Collection<Team> getTeams() {
        return utils.getTeams();
    }

}
