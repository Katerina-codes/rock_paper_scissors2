package main.game;

import static main.game.Moves.*;
import static main.game.Result.DRAW;

public class Rules {
    public String scoreGame(Moves playerOneMove, Moves playerTwoMove) {
        if (playerOneMove.equals(playerTwoMove)) {
            return DRAW.getResult();
        } else if (playerOneMove.equals(ROCK)) {
            return findScoreForRock(playerTwoMove).getMove();
        } else if (playerOneMove.equals(PAPER)) {
            return findScoreForPaper(playerTwoMove).getMove();
        } else  {
            return findScoreForScissors(playerTwoMove).getMove();
        }
    }

    public Moves findScoreForRock(Moves playerTwoMove) {
        if (playerTwoMove.equals(SCISSORS)) {
            return ROCK;
        } else {
            return PAPER;
        }
    }

    public Moves findScoreForPaper(Moves playerTwoMove) {
        if (playerTwoMove.equals(ROCK)) {
            return PAPER;
        } else {
            return SCISSORS;
        }
    }

    public Moves findScoreForScissors(Moves playerTwoMove) {
        if (playerTwoMove.equals(PAPER)) {
            return SCISSORS;
        } else {
            return ROCK;
        }
    }
}
