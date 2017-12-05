package test.game;

import main.game.Ui;

public class FakeCommandlineUi implements Ui {

    private boolean askForMoveWasCalled = false;
    private boolean announceWinnerWasCalled = false;

    public void askForMove() {
        this.askForMoveWasCalled = true;
    }

    public String getsMove() {
        return null;
    }

    public void announceWinner(String winningMove) {
        this.announceWinnerWasCalled = true;
    }

    public boolean askForMoveWasCalled() {
        return askForMoveWasCalled;
    }

    public boolean announceWinnerWasCalled() {
        return announceWinnerWasCalled;
    }
}
