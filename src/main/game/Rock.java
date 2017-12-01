package main.game;

import static main.game.Moves.*;

public class Rock implements Move {

    @Override
    public String scoreAgainst(Moves playerTwoMove) {
        if (playerTwoMove.equals(SCISSORS)) {
            return ROCK.getMove();
        } else {
            return PAPER.getMove();
        }
    }
}
