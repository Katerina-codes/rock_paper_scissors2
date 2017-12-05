package main.game;

public interface Ui {
    void askForMove();
    String getsMove();
    void announceWinner(String winningMove);
}
