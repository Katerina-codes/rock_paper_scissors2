package main.game.Language;

import main.game.Moves.Moves;

import java.util.HashMap;
import java.util.Map;

import static main.game.Moves.Moves.*;

public class Italian implements Language {

    @Override
    public String promptForMove() {
        return "Scegli una mossa: ‘sasso’, ‘carta’ o ‘forbici’: ";
    }

    @Override
    public String announceWinner(String convertedWinningMove) {
        if (convertedWinningMove.contains("patta")) {
            return "E'patta!";
        } else {
            return String.format("%s vince!", convertedWinningMove);
        }
    }

    @Override
    public String promptForGameMode() {
        return "Inserisci '1' per Umani contro Umani\n" +
                "Inserisci '2' per Uomo contro Computer";
    }

    @Override
    public Moves translateToEnglish(String move) {
        Map<String, Moves> translations = new HashMap<>();
        translations.put("sasso", ROCK);
        translations.put("carta", PAPER);
        translations.put("forbici", SCISSORS);
        return translations.get(move);
    }

    @Override
    public String announceDraw() {
        return "E'patta!";
    }

    @Override
    public String announcePlayerOneWin() {
        return "Il giocatore numero uno vince!";
    }

    @Override
    public String announcePlayerTwoWin() {
        return "Il giocatore numero due vince!";
    }
}