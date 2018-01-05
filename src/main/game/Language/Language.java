package main.game.Language;

import main.game.Moves.Moves;

public interface Language {
    String promptForMove();

    String announceWinner(String convertedWinningMove);

    String promptForGameMode();

    Moves translateToEnglish(String move);
}
