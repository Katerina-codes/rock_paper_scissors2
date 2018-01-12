package main.game;

import main.game.CommandLine.Ui;
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
        Moves playerOneMove;
        Moves playerTwoMove;

        inputOutput.setLanguage();
        String gameMode = setGameMode();

        if (gameMode.equals("1")) {
            playerOneMove = getPlayerMove();
            playerTwoMove = getPlayerMove();
        } else {
            playerOneMove = getPlayerMove();
            playerTwoMove = Computer.playMove();
        }
        Result winningMove = rules.findWinningPLayer(playerOneMove, playerTwoMove);
        inputOutput.announceWinnerTwo(winningMove);
    }

    private Moves getPlayerMove() {
        inputOutput.askForMove();
        return inputOutput.playMove();
    }

    private String setGameMode() {
        inputOutput.promptForGameMode();
        return inputOutput.getGameMode();
    }
}