package main.game.CommandLine;
import main.game.Moves.Moves;
import main.game.Result;

public interface Ui {
    void askForMove();

    Moves playMove();

    void announceWinner(Result playerOneWins);

    void askForLanguage();

    String getLanguage();

    void setLanguage();

    void promptForGameMode();

    String getGameMode();
}