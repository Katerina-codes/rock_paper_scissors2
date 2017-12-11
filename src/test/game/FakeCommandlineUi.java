package test.game;

import main.game.Moves;
import main.game.Result;
import main.game.Ui;

public class FakeCommandlineUi implements Ui {

    private boolean askForMoveWasCalled = false;
    private boolean announceWinnerWasCalled = false;
    private boolean getsMoveFromUserWasCalled = false;
    private boolean announceWinnerTwoWasCalled = false;

    public void askForMove() {
        this.askForMoveWasCalled = true;
    }

    public Moves getMove() {
        getsMoveFromUserWasCalled = true;
        return Moves.ROCK;
    }

    public void announceWinner(Result winningMove) {
        this.announceWinnerWasCalled = true;
    }

    public Moves convertMove(String playerOneMove) {
        return Moves.ROCK;
    }

    public void announceWinnerTwo(Result playerOneWins) {
       this.announceWinnerTwoWasCalled = true;
    }

    public boolean askForMoveWasCalled() {
        return askForMoveWasCalled;
    }

    public boolean getsMoveFromUserWasCalled() {
        return getsMoveFromUserWasCalled;
    }

    public boolean announceWinnerWasCalled() {
        return announceWinnerWasCalled;
    }

    public boolean announceWinnerTwoWasCalled() {
        return announceWinnerTwoWasCalled;
    }
}


