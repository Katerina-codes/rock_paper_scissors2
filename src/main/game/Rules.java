package main.game;

import java.util.Map;

import static main.game.Result.DRAW;
import static main.game.Result.PLAYER_ONE_WINS;

public class Rules {

    private Map<Moves, Move> moves;

    public Rules(Map moves) {
        this.moves = moves;
    }

    public String scoreGame(Moves playerOneMove, Moves playerTwoMove) {
        if (playerOneMove.equals(playerTwoMove)) {
            return DRAW.getResult();
        } else {
            return moves.get(playerOneMove).scoreAgainst(playerTwoMove);
        }
    }


    public Result scoreGameTwo(Moves playerOneMove, Moves playerTwoMove) {
        if (playerOneMove.equals(playerTwoMove)) {
            return DRAW;
        } else {
            Moves winningMove = Moves.ROCK;
            return findWinningPlayer(playerOneMove, winningMove);
        }
    }

    public Result findWinningPlayer(Moves playerOneMove, Moves winningMove) {
        if (playerOneMove.equals(winningMove))
            return Result.PLAYER_ONE_WINS;
        else
            return Result.PLAYER_TWO_WINS;
    }
}
