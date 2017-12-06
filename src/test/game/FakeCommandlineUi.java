package test.game;

import main.game.Moves;
import main.game.Result;
import main.game.Ui;

public class FakeCommandlineUi implements Ui {

    private boolean askForMoveWasCalled = false;
    private boolean announceWinnerWasCalled = false;
    private boolean getsMoveFromUserWasCalled = false;
    private boolean announceWinnerTwoWasCalled = false;
    private boolean getsMoveFromUserTwoWasCalled = false;

    public void askForMove() {
        this.askForMoveWasCalled = true;
    }

    public String getsMove() {
        getsMoveFromUserWasCalled = true;
        return "rock";
    }

    public void announceWinner(String winningMove) {
        this.announceWinnerWasCalled = true;
    }

    public Moves getsMoveTwo() {
        getsMoveFromUserTwoWasCalled = true;
        return Moves.ROCK;
    }

    public void announceWinnerTwo(Result winningMove) {
        this.announceWinnerTwoWasCalled = true;
    }

    public Moves convertMove(String playerOneMove) {
        return Moves.ROCK;
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

    public boolean getsMoveFromUserTwoWasCalled() {
        return getsMoveFromUserTwoWasCalled;
    }

    public boolean announceWinnerTwoWasCalled() {
        return announceWinnerTwoWasCalled;
    }
}


