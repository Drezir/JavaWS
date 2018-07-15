package teams;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TeamUtility {

    private Map<String, Team> teams;

    public void makeTestTeams() {
        teams = new HashMap<String, Team>();
        Team team1 = new Team(
                Arrays.asList(new Player("Christiano Ronaldo", "Ronaldo")),
                "Arsenal"
        );
        Team team2 = new Team(
                Arrays.asList(new Player("Petr Čech", "Čech")),
                "Chelsea"
        );
        teams.put("Arsenal", team1);
        teams.put("Chelsea", team2);
    }

    public Team getTeam(String name) {
        return teams.getOrDefault(name, Team.defaultTeam);
    }

    public Collection<Team> getTeams() {
        return teams.values();
    }
}
