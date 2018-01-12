package main.game.Language;

import main.game.Moves.Moves;

import java.util.HashMap;
import java.util.Map;

import static main.game.Moves.Moves.*;

public class Greek implements Language {

    public String promptForMove() {
        return "Eπιλέξτε την κίνηση σας πληκτρολογώντας 'πέτρα', 'χαρτί' ή 'ψαλίδι': ";
    }

    public Moves translateToEnglish(String move) {
        Map<String, Moves> translations = new HashMap<>();
        translations.put("πέτρα", ROCK);
        translations.put("χαρτί", PAPER);
        translations.put("ψαλίδι", SCISSORS);
        return (Moves) translations.get(move);
    }

    public String announceWinner(String convertedWinningMove) {
        if (convertedWinningMove.contains("One")) {
            convertedWinningMove = "Paíktis ένα";
        } else if (convertedWinningMove.contains("draw")) {
            return "Είναι ισοπαλία!";
        } else {
            convertedWinningMove = "Paíktis dýo";
        }
        return (String.format("%s κερδίζει!", convertedWinningMove));
    }

    public String promptForGameMode() {
        return "Eisagágete '1' gia Anthrópina enantíon Anthrópou\nEisagágete '2' gia Anthrópino enantíon ypologistí";
    }

    public String announceDraw() {
        return "Είναι ισοπαλία!";
    }

    public String announcePlayerOneWin() {
        return "Paíktis ένα κερδίζει!";
    }

    public String announcePlayerTwoWin() {
        return "Paíktis dýo κερδίζει!";
    }
}
