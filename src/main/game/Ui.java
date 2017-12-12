package main.game;

public interface Ui {
    Moves getMove();
    Moves convertMove(String playerOneMove);
    void askForMoveTwo();
    void announceWinnerTwo(Result playerOneWins);
    void askForLanguage();
    String getLanguage();
    void setUserLanguage();
}
