package main.game;

import main.game.Moves.Moves;

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
        Moves playerTwoMove = getPlayerTwoMove(gameMode);
        Result winningMove = rules.findWinningPLayer(playerOneMove, playerTwoMove);
        inputOutput.announceWinner(winningMove);
    }
    private Moves getPlayerTwoMove(String gameMode) {
        return inputOutput.getMoveTwo(gameMode);
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