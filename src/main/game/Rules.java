package main.game;

import java.util.Map;

import static main.game.Result.DRAW;

public class Rules {

    private Map<Moves, Move> moves;

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
}
