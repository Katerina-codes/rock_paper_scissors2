package main.game;

public class Game {

    private final Ui inputOutput;
    private Rules rules;

    public Game(Ui inputOutput, Rules rules) {
        this.inputOutput = inputOutput;
        this.rules = rules;
    }

    public void runGameTwo() {
        inputOutput.askForLanguage();
        inputOutput.getLanguage();
        inputOutput.askForMoveTwo();
        Moves playerOneMove = inputOutput.getMove();
        inputOutput.askForMoveTwo();
        Moves playerTwoMove = inputOutput.getMove();
        Result winningMove = rules.findWinningPLayer(playerOneMove, playerTwoMove);
        inputOutput.announceWinnerTwo(winningMove);
    }
}
