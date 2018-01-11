package main.game.Language;

import main.game.Moves.Moves;

import java.util.HashMap;
import java.util.Map;

import static main.game.Moves.Moves.*;

public class English implements Language {
    public String promptForMove() {
        return "Pick a move. Enter 'rock', 'paper' or 'scissors': ";
    }

    public String announceWinner(String convertedWinningMove) {
        if (convertedWinningMove.contains("draw")) {
            return announceDraw();
        } else {
            return (String.format("%s wins!", convertedWinningMove));
        }
    }

    public String promptForGameMode() {
        return "Enter '1' for Human vs. Human\nEnter '2' for Human vs. Computer";
    }

    public Moves translateToEnglish(String move) {
        Map<String, Moves> translations = new HashMap<>();
        translations.put("rock", ROCK);
        translations.put("paper", PAPER);
        translations.put("scissors", SCISSORS);
        return translations.get(move);
    }

    public String askForLanguage() {
        return "Enter '1' for English\n" +
                "Eισάγετε '2' για Ελληνικά\n" +
                "Scegli '3' per Italiano";
    }

    public String announceDraw() {
        return "It's a draw!";
    }
}
