package main.game;

import static main.game.Moves.*;

public class Rock implements Move {
    public Moves scoreAgainst(Moves playerTwoMove) {
        if (playerTwoMove.equals(SCISSORS)) {
            return ROCK;
        } else {
            return PAPER;
        }
    }
}
