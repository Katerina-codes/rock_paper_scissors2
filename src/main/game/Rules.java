package main.game;

import java.util.HashMap;
import java.util.Map;

import static main.game.Moves.*;
import static main.game.Result.DRAW;

public class Rules {

    private Map<Moves, Move> moves;

    public Rules() {

    }

    public Rules(Map moves) {
        this.moves = moves;
    }

    public String scoreGameTwo(Moves playerOneMove, Moves playerTwoMove) {
        if (playerOneMove.equals(playerTwoMove)) {
            return DRAW.getResult();
        } else {
            return moves.get(playerOneMove).scoreAgainst(playerTwoMove);
        }
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
