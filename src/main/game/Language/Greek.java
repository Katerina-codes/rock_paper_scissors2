package main.game.Language;

public class Greek implements Language {

    public String promptForMove() {
        return "επιλέξτε την κίνηση σας πληκτρολογώντας 'πέτρα', 'χαρτί' ή 'ψαλίδι': ";
    }

    public String announceWinner(String convertedWinningMove) {
        return (String.format("%s κερδίζει 🙌 ", convertedWinningMove));
    }

    public String askForLanguage() {
        return null;
    }
}
