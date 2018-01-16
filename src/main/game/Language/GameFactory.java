package main.game.Language;

import main.game.CommandLine.Ui;
import main.game.Player.Human;
import test.game.Player.Player;

import java.util.Arrays;
import java.util.List;

public class GameFactory {
    private final Ui inputOutput;

    public GameFactory(Ui inputOutput) {
        this.inputOutput = inputOutput;
    }

    public List<Player> getPlayerTypes(String playerTypes) {
        return Arrays.asList(new Human(inputOutput), new Human(inputOutput));
    }
}
