package main.game;

import static main.game.Moves.*;

public class Paper implements Move {
    @Override
    public String scoreAgainst(Moves playerTwoMove) {
        if (playerTwoMove.equals(ROCK)) {
            return PAPER.getMove();
        } else {
            return SCISSORS.getMove();
        }
    }
}
