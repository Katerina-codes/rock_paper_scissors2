package main.game;

import java.util.Map;

import static main.game.Result.DRAW;

public class Rules {

    private Map<Moves, Move> moves;

    public Rules(Map moves) {
        this.moves = moves;
    }

    public Result scoreGameTwo(Moves playerOneMove, Moves playerTwoMove) {
        if (playerOneMove.equals(playerTwoMove)) {
            return DRAW;
        } else {
            Moves winningMove = scoreMove(playerOneMove, playerTwoMove);
            return findWinningPlayer(playerOneMove, winningMove);
        }
    }

    public Moves scoreMove(Moves playerOneMove, Moves playerTwoMove) {
        return moves.get(playerOneMove).scoreAgainst(playerTwoMove);
    }

    public Result findWinningPlayer(Moves playerOneMove, Moves winningMove) {
        if (playerOneMove.equals(winningMove))
            return Result.PLAYER_ONE_WINS;
        else
            return Result.PLAYER_TWO_WINS;
    }
}
