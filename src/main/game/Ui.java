package main.game;

public interface Ui {
    void askForMove();
    Moves getsMoveTwo();
    void announceWinnerTwo(Result winningMove);
    Moves convertMove(String playerOneMove);
}
