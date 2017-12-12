package main.game;

public class English implements Language {
    public String promptForMove() {
        return "Pick a move. Enter 'rock', 'paper' or 'scissors': ";
    }

    public String announceWinner(String convertedWinningMove) {
        return (String.format("%s wins!", convertedWinningMove));
    }

    public String askForLanguage() {
        return "Enter '1' for English\n" +
                "Eiságete '2' gia Ελληνικά";
    }
}
