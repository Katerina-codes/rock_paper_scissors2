package main.game;

public class Game {

    private final Ui inputOutput;
    private Rules rules;

    public Game(Ui inputOutput, Rules rules) {
        this.inputOutput = inputOutput;
        this.rules = rules;
    }

    public void runGame() {
        inputOutput.askForMove();
        String playerOneMove = inputOutput.getsMove();
        Moves convertedPlayerOneMove = inputOutput.convertMove(playerOneMove);
        String playerTwoMove = inputOutput.getsMove();
        Moves convertedPlayerTwoMove = inputOutput.convertMove(playerTwoMove);
        String winningMove = rules.scoreGame(convertedPlayerOneMove, convertedPlayerTwoMove);
        inputOutput.announceWinner(winningMove);
    }

    public void runGameTwo() {
        inputOutput.askForMove();
        Moves playerOneMove = inputOutput.getsMoveTwo();
        Moves playerTwoMove = inputOutput.getsMoveTwo();
        Result winningMove = rules.scoreGameTwo(playerOneMove, playerTwoMove);
        inputOutput.announceWinnerTwo(winningMove);
    }
}
