package main.game;

public class Game {

    private final Ui inputOutput;
    private Rules rules;

    public Game(Ui inputOutput, Rules rules) {
        this.inputOutput = inputOutput;
        this.rules = rules;
    }

    public void runGameTwo() {
        inputOutput.askForMove();
        Moves playerOneMove = inputOutput.getsMoveTwo();
        inputOutput.askForMove();
        Moves playerTwoMove = inputOutput.getsMoveTwo();
        Result winningMove = rules.scoreGameTwo(playerOneMove, playerTwoMove);
        inputOutput.announceWinnerTwo(winningMove);
    }
}
