package main.game;

import main.game.Moves.Moves;

public interface Ui {
    void askForMove();

    void announceWinner(Result playerOneWins);

    void askForLanguage();

    String getLanguage();

    void setLanguage();

    void promptForGameMode();

    String getGameMode();

    Moves getMoveThree(String gameMode);
}