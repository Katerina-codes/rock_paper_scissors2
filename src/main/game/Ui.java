package main.game;

public interface Ui {
    void askForMove();
    String getsMove();
    void announceWinner(String winningMove);
    Moves getsMoveTwo();
    void announceWinnerTwo(Result winningMove);
    Moves convertMove(String playerOneMove);
}
