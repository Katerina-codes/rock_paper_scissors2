package main.game.Language;

import main.game.Moves.Moves;

public interface Language {
    String promptForMove();

    String promptForGameMode();

    Moves translateToEnglish(String move);

    String announceDraw();

    String announcePlayerOneWin();

    String announcePlayerTwoWin();
}