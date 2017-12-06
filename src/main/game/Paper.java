package main.game;

import static main.game.Moves.*;

public class Paper implements Move {
    public Moves scoreAgainst(Moves playerTwoMove) {
        if (playerTwoMove.equals(ROCK)) {
            return PAPER;
        } else {
            return SCISSORS;
        }
    }
}
