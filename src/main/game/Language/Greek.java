package main.game.Language;

public class Greek implements Language {

    public String promptForMove() {
        return "Eπιλέξτε την κίνηση σας πληκτρολογώντας 'πέτρα', 'χαρτί' ή 'ψαλίδι': ";
    }

    public String announceWinner(String convertedWinningMove) {
        if (convertedWinningMove.contains("One")) {
            convertedWinningMove = "Paíktis ένα";;
    } else {
        convertedWinningMove = "Paíktis dýo";;
    }
        return (String.format("%s κερδίζει!", convertedWinningMove));
    }
}
