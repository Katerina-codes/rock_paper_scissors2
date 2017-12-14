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
        String gameMode = setGameMode();
        Moves playerOneMove = getPlayerMove();

        if (gameMode.equals("1")) {
            Moves playerTwoMove = getPlayerMove();
            Result winningMove = rules.findWinningPLayer(playerOneMove, playerTwoMove);
            inputOutput.announceWinner(winningMove);
        } else {
            Moves playerTwoMove = Computer.playMove();
            Result winningMove = rules.findWinningPLayer(playerOneMove, playerTwoMove);
            inputOutput.announceWinner(winningMove);
        }
    }

    private Moves getPlayerMove() {
        inputOutput.askForMove();
        return inputOutput.getMove();
    }

    private String setGameMode() {
        inputOutput.promptForGameMode();
        return inputOutput.getGameMode();
    }
}