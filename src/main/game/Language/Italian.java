package main.game.Language;

import main.game.Moves.Moves;

public class Italian implements Language {

    @Override
    public String promptForMove() {
        return "Scegli una mossa: ‘sasso’, ‘carta’ o ‘forbici’: ";
    }

    @Override
    public String announceWinner(String convertedWinningMove) {
        return "Il giocatore numero uno vince!";
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
