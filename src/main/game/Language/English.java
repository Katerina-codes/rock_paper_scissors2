package main.game.Language;

import main.game.Moves.Moves;

import java.util.HashMap;

import static main.game.Moves.Moves.*;

public class English implements Language {
    public String promptForMove() {
        return "Pick a move. Enter 'rock', 'paper' or 'scissors': ";
    }

    public String announceWinner(String convertedWinningMove) {
        if (convertedWinningMove.contains("draw")) {
            return "It's a draw!";
        } else {
            return (String.format("%s wins!", convertedWinningMove));
        }
    }

    public String promptForGameMode() {
        return "Enter '1' for Human vs. Human\nEnter '2' for Human vs. Computer";
    }

    public Moves translateToEnglish(String move) {
        HashMap<String, Moves> translations = new HashMap<>();
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
}
