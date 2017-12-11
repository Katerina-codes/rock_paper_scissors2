package test.game;

import main.game.Moves;
import main.game.Result;
import main.game.Ui;

public class FakeCommandlineUi implements Ui {

    private boolean getsMoveFromUserWasCalled = false;
    private boolean announceWinnerTwoWasCalled = false;
    private boolean askForMoveTwoWasCalled = false;
    private boolean askForLanguageWasCalled = false;

    public Moves getMove() {
        getsMoveFromUserWasCalled = true;
        return Moves.ROCK;
    }

    public Moves convertMove(String playerOneMove) {
        return Moves.ROCK;
    }

    public void announceWinnerTwo(Result playerOneWins) {
       this.announceWinnerTwoWasCalled = true;
    }

    public void askForLanguage() {
        this.askForLanguageWasCalled = true;
    }

    public void askForMoveTwo() {
        this.askForMoveTwoWasCalled = true;
    }

    public boolean askForLanguageWasCalled() {
        return askForLanguageWasCalled;
    }

    public boolean getsMoveFromUserWasCalled() {
        return getsMoveFromUserWasCalled;
    }

    public boolean announceWinnerTwoWasCalled() {
        return announceWinnerTwoWasCalled;
    }

    public boolean askForMoveTwoWasCalled() {
        return askForMoveTwoWasCalled;
    }
}


