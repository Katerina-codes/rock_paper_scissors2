package main.game;

import static main.game.Moves.*;

public class Scissors implements Move {
    @Override
    public String scoreAgainst(Moves playerTwoMove) {
        if (playerTwoMove.equals(PAPER)) {
            return SCISSORS.getMove();
        } else {
            return ROCK.getMove();
        }
    }
}
