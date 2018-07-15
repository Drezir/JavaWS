package teams;

import lombok.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

@Data
@AllArgsConstructor
public class Team {

    public static final Team defaultTeam = new Team(new LinkedList<>(), "Unknown");

    private Collection<Player> players;
    private String name;

    public Team() {
        players = defaultTeam.players;
        name = defaultTeam.name;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name);
        players.forEach(player -> stringBuilder.append(">> ").append(player));
        return stringBuilder.toString();
    }
}
