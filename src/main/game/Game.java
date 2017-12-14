package main.game;

import main.game.Moves.Moves;
import main.game.Player.Computer;

public class Game {

    private final Ui inputOutput;
    private Rules rules;

    public Game(Ui inputOutput, Rules rules) {
        this.inputOutput = inputOutput;
        this.rules = rules;
    }

    public void runGame() {
        inputOutput.setLanguage();
        inputOutput.promptForGameMode();
        String gameMode = inputOutput.getGameMode();
        inputOutput.askForMove();
        Moves playerOneMove = inputOutput.getMove();

        if (gameMode.equals("1")) {
            inputOutput.askForMove();
            Moves playerTwoMove = inputOutput.getMove();
            Result winningMove = rules.findWinningPLayer(playerOneMove, playerTwoMove);
            inputOutput.announceWinner(winningMove);
        } else {
            Moves playerTwoMove = Computer.playMove();
            Result winningMove = rules.findWinningPLayer(playerOneMove, playerTwoMove);
            inputOutput.announceWinner(winningMove);
        }
    }
}
