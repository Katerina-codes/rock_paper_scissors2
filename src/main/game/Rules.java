package main.game;

public class Rules {
    public String scoreGame(String playerOneMove, String playerMoveTwo) {
        if (playerOneMove.equals(playerMoveTwo)) {
            return "draw";
        } else if (playerMoveTwo.equals("scissors")) {
            return "rock wins";
        } else {
            return "paper wins";
        }
    }
}
