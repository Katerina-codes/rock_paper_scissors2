package main.game.Language;

public class Greek implements Language {

    public String promptForMove() {
        return "Eπιλέξτε την κίνηση σας πληκτρολογώντας 'πέτρα', 'χαρτί' ή 'ψαλίδι': ";
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
}
