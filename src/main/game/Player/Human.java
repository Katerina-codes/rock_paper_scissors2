package main.game.Player;

import main.game.CommandLine.Ui;
import main.game.Moves.Moves;
import test.game.Player.Player;

public class Human implements Player {

    private Ui inputOutput;

    public Human(Ui inputOutput) {
       this.inputOutput = inputOutput;
    }

    public Moves playMove() {
        inputOutput.askForMove();
        return inputOutput.playMove();
    }
}
