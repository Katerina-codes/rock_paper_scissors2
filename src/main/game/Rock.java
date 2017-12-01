package main.game;

import static main.game.Moves.SCISSORS;

public class Rock implements Move {
    @Override
    public String scoreAgainst(Moves playerTwoMove) {
        if (playerTwoMove.equals(SCISSORS)) {
            return "rock";
        } else {
            return "paper";
        }
    }
}
