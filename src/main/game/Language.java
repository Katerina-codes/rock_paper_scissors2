package main.game;

public interface Language {
    String promptForMove();
    String announceWinner(String convertedWinningMove);
    String askForLanguage();
}
