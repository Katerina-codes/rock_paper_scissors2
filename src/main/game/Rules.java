package main.game;

import java.util.Map;

import static main.game.Result.DRAW;

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
            return findWinningPlayer(playerOneMove, playerTwoMove);
        }
    }

    public Result findWinningPlayer(Moves playerOneMove, Moves playerTwoMove) {
        return Result.PLAYER_ONE_WINS;
    }
}
