package main.game.Language;

import main.game.Moves.Moves;

public class Italian implements Language {

    @Override
    public String promptForMove() {
        return null;
    }

    @Override
    public String announceWinner(String convertedWinningMove) {
        return null;
    }

    @Override
    public String promptForGameMode() {
        return null;
    }

    @Override
    public Moves translateToEnglish(String move) {
        return null;
    }
}
