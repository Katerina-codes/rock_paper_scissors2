package main.game.Moves;

import main.game.Moves.Move;
import main.game.Moves.Moves;

import static main.game.Moves.Moves.*;

public class Scissors implements Move {
    @Override
    public Moves scoreAgainst(Moves playerTwoMove) {
        if (playerTwoMove.equals(PAPER)) {
            return SCISSORS;
        } else {
            return ROCK;
        }
    }
}
