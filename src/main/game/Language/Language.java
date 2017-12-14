package main.game.Language;

public interface Language {
    String promptForMove();

    String announceWinner(String convertedWinningMove);

    String promptForGameMode();
}
