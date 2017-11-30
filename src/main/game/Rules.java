package main.game;

public class Rules {
    public String scoreGame(String playerOneMove, String playerTwoMove) {
        if (playerOneMove.equals(playerTwoMove)) {
            return "draw";
        } else if (playerOneMove.equals("rock")) {
            return findScoreForRock(playerTwoMove);
        } else if (playerOneMove.equals("paper")) {
            return findScoreForPaper(playerTwoMove);
        } else if (playerOneMove.equals("rock") && (playerTwoMove.equals("paper"))) {
            return "paper wins";
        } else if (playerOneMove.equals("scissors") && (playerTwoMove.equals("rock"))) {
            return "rock wins";
        } else {
            return "scissors wins";
        }
    }

    public String findScoreForRock(String playerTwoMove) {
        if (playerTwoMove.equals("scissors")) {
            return "rock wins";
        } else {
            return "paper wins";
        }
    }

    public String findScoreForPaper(String playerTwoMove) {
        if (playerTwoMove.equals("rock")) {
            return "paper wins";
        } else {
            return "scissors wins";
        }
    }

}
