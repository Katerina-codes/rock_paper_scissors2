package main.game.Player;

import main.game.CommandLine.Ui;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameFactory {
    private final Ui inputOutput;

    public GameFactory(Ui inputOutput) {
        this.inputOutput = inputOutput;
    }

    public List<Player> getPlayerTypes(String playerTypes) {
        Player[] humanVersusHuman = {new Human(inputOutput), new Human(inputOutput)};
        Player[] humanVersusComputer = {new Human(inputOutput), new Computer()};

        Map<String, List<Player>> gameTypes = new HashMap<>();
        gameTypes.put("1", Arrays.asList(humanVersusHuman));
        gameTypes.put("2", Arrays.asList(humanVersusComputer));

        return gameTypes.get(playerTypes);
    }
}
