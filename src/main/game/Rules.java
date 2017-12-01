package main.game;

import java.util.HashMap;

import static main.game.Moves.*;
import static main.game.Result.DRAW;

public class Rules {

    public Rules() {

    }

    public String scoreGame(Moves playerOneMove, Moves playerTwoMove) {
        HashMap<Moves, Move> moves = new HashMap<>();
        Move rockMove = new Rock();
        Move paperMove = new Paper();
        Move scissorsMove = new Scissors();
        moves.put(ROCK, rockMove);
        moves.put(PAPER, paperMove);
        moves.put(SCISSORS, scissorsMove);

        if (playerOneMove.equals(playerTwoMove)) {
            return DRAW.getResult();
        } else {
            return moves.get(playerOneMove).scoreAgainst(playerTwoMove);
        }
    }
}
