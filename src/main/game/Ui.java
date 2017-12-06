package main.game;

public interface Ui {
    void askForMove();
    Moves getMove();
    void announceWinner(Result winningMove);
    Moves convertMove(String playerOneMove);
}
