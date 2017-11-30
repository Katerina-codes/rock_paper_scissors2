package main.game;

public class Rules {
    public String scoreGame(String playerOneMove, String playerTwoMove) {
        if (playerOneMove.equals(playerTwoMove)) {
            return "draw";
        } else if (playerTwoMove.equals("scissors")) {
            return "rock wins";
        } else if (playerOneMove.equals("rock") && (playerTwoMove.equals("paper"))) {
            return "paper wins";
        } else {
            return "scissors wins";
        }
    }
}
