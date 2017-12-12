package main.game.Moves;

import main.game.Moves.Move;
import main.game.Moves.Moves;

import static main.game.Moves.Moves.*;

public class Paper implements Move {
    public Moves scoreAgainst(Moves playerTwoMove) {
        if (playerTwoMove.equals(ROCK)) {
            return PAPER;
        } else {
            return SCISSORS;
        }
    }
}
