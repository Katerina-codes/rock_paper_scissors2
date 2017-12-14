package main.game.Language;

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

    public String askForLanguage() {
        return "Enter '1' for English\n" +
                "Eισάγετε '2' για Ελληνικά";
    }
}
