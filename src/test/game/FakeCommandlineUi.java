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

    public String getsMove() {
        getsMoveFromUserWasCalled = true;
        return "rock";
    }

    public void announceWinner(String winningMove) {
        this.announceWinnerWasCalled = true;
    }

    @Override
    public Moves getsMoveTwo() {
        return null;
    }

    @Override
    public void announceWinnerTwo(Result winningMove) {
        this.announceWinnerTwoWasCalled = true;
    }

    @Override
    public Moves convertMove(String playerOneMove) {
        return Moves.ROCK;
    }


    public boolean askForMoveWasCalled() {
        return askForMoveWasCalled;
    }

    public boolean announceWinnerWasCalled() {
        return announceWinnerWasCalled;
    }

    public boolean announceWinnerTwoWasCalled() {
        return announceWinnerTwoWasCalled;
    }

    public boolean getsMoveFromUserWasCalled() {
        return getsMoveFromUserWasCalled;
    }
}
