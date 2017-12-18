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

    public void runGameTwo() {
        inputOutput.setLanguage();
        String gameMode = setGameMode();
        Moves playerOneMove = getPlayerMove();
        Moves playerTwoMove = getPlayerTwoMove(gameMode);
        Result winningMove = rules.findWinningPLayer(playerOneMove, playerTwoMove);
        inputOutput.announceWinner(winningMove);
    }
    private Moves getPlayerTwoMove(String gameMode) {
        Moves playerTwoMove;

        if (gameMode.equals("1")) {
            playerTwoMove = getPlayerMove();
        } else {
            playerTwoMove = Computer.playMove();
        }
        return playerTwoMove;
    }

    private Moves getPlayerMove() {
        inputOutput.askForMove();
        return inputOutput.getMove();
    }

    private Moves getPlayerMove(String gameMode) {
        inputOutput.askForMove();
        return inputOutput.getMoveTwo(gameMode);
    }

    private String setGameMode() {
        inputOutput.promptForGameMode();
        return inputOutput.getGameMode();
    }
}