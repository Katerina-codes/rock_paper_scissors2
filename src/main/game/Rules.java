package main.game;

public class Rules {
    public String scoreGame(String playerOneMove, String playerTwoMove) {
        if (playerOneMove.equals(playerTwoMove)) {
            return "draw";
        } else if (playerOneMove.equals("rock") && (playerTwoMove.equals("scissors"))) {
            return "rock wins";
        } else if (playerOneMove.equals("scissors") && (playerTwoMove.equals("rock"))) {
            return "rock wins";
        } else if (playerOneMove.equals("rock") && (playerTwoMove.equals("paper"))) {
            return "paper wins";
        } else {
            return "scissors wins";
        }
    }
}
