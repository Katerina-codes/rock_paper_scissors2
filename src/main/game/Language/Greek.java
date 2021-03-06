package main.game.Language;

import main.game.Moves.Moves;

import java.util.HashMap;
import java.util.Map;

import static main.game.Moves.Moves.*;

public class Greek implements Language {

    public String promptForMove() {
        return "Eπιλέξτε την κίνηση σας πληκτρολογώντας 'πέτρα', 'χαρτί' ή 'ψαλίδι': ";
    }

    public String promptForGameMode() {
        return "Eisagágete '1' gia Anthrópina enantíon Anthrópou\nEisagágete '2' gia Anthrópino enantíon ypologistí";
    }

    public Moves translateToEnglish(String move) {
        Map<String, Moves> translations = new HashMap<>();
        translations.put("πέτρα", ROCK);
        translations.put("χαρτί", PAPER);
        translations.put("ψαλίδι", SCISSORS);
        return translations.get(move);
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
