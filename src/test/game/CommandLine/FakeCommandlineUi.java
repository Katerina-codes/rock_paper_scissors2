package test.game.CommandLine;

import main.game.Moves.Moves;
import main.game.Result;
import main.game.Ui;

public class FakeCommandlineUi implements Ui {

    private boolean getsMoveFromUserWasCalled = false;
    private boolean announceWinnerTwoWasCalled = false;
    private boolean askForMoveTwoWasCalled = false;
    private boolean setUserLanguageWasCalled = false;
    private boolean promptForGameModeWasCalled = false;
    private boolean getGameModeWasCalled = false;

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
    }

    public String getLanguage() {
        return "1";
    }

    public void setLanguage() {
        this.setUserLanguageWasCalled = true;
    }

    public void promptForGameMode() {
      this.promptForGameModeWasCalled = true;
    }

    public String getGameMode() {
        this.getGameModeWasCalled = true;
        return "1";
    }

    public void askForMoveTwo() {
        this.askForMoveTwoWasCalled = true;
    }

    public boolean promptForGameModeWasCalled() {
        return promptForGameModeWasCalled;
    }

    public boolean isGetGameModeWasCalled() {
        return getGameModeWasCalled;
    }

    public boolean setUserLanguageWasCalled() {
        return setUserLanguageWasCalled;
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
