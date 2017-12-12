package main.game;

import main.game.Moves.Move;
import main.game.Moves.Moves;

import java.util.Map;

import static main.game.Result.DRAW;

public class Rules {

    private Map<Moves, Move> moves;

    public Rules(Map moves) {
        this.moves = moves;
    }

    public Result findWinningPLayer(Moves playerOneMove, Moves playerTwoMove) {
        if (playerOneMove.equals(playerTwoMove)) {
            return DRAW;
        } else {
            Moves winningMove = scoreMove(playerOneMove, playerTwoMove);
            return scoreGame(playerOneMove, winningMove);
        }
    }

    public Moves scoreMove(Moves playerOneMove, Moves playerTwoMove) {
        return moves.get(playerOneMove).scoreAgainst(playerTwoMove);
    }

    public Result scoreGame(Moves playerOneMove, Moves winningMove) {
        if (playerOneMove.equals(winningMove)) {
            return Result.PLAYER_ONE_WINS;
        } else {
            return Result.PLAYER_TWO_WINS;
        }
    }
}
