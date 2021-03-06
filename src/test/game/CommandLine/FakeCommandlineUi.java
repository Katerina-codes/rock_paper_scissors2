package test.game.CommandLine;

import main.game.Moves.Moves;
import main.game.Result;
import main.game.CommandLine.Ui;

public class FakeCommandlineUi implements Ui {

    private boolean announceWinnerWasCalled = false;
    private boolean askForMoveWasCalled = false;
    private boolean setUserLanguageWasCalled = false;
    private boolean promptForGameModeWasCalled = false;
    private boolean getGameModeWasCalled = false;
    private boolean playMoveWasCalled = false;

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

    public void announceWinner(Result winningMove) {
        this.announceWinnerWasCalled = true;
    }

    public Moves playMove() {
        playMoveWasCalled = true;
        return Moves.ROCK;
    }

    public void askForMove() {
        this.askForMoveWasCalled = true;
    }

    public boolean promptForGameModeWasCalled() {
        return promptForGameModeWasCalled;
    }

    public boolean getGameModeWasCalled() {
        return getGameModeWasCalled;
    }

    public boolean setUserLanguageWasCalled() {
        return setUserLanguageWasCalled;
    }

    public boolean announceWinnerTwoWasCalled() {
        return announceWinnerWasCalled;
    }

    public boolean askForMoveWasCalled() {
        return askForMoveWasCalled;
    }

    public boolean getMoveWasCalled() {
        return playMoveWasCalled;
    }
}
