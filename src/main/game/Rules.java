package main.game;

import static main.game.Moves.*;

public class Rules {
    public String scoreGame(Moves playerOneMove, Moves playerTwoMove) {
        if (playerOneMove.equals(playerTwoMove)) {
            return "draw";
        } else if (playerOneMove.equals(ROCK)) {
            return findScoreForRock(playerTwoMove);
        } else if (playerOneMove.equals(PAPER)) {
            return findScoreForPaper(playerTwoMove);
        } else  {
            return findScoreForScissors(playerTwoMove);
        }
    }

    public String findScoreForRock(Moves playerTwoMove) {
        if (playerTwoMove.equals(SCISSORS)) {
            return "rock wins";
        } else {
            return "paper wins";
        }
    }

    public String findScoreForPaper(Moves playerTwoMove) {
        if (playerTwoMove.equals(ROCK)) {
            return "paper wins";
        } else {
            return "scissors wins";
        }
    }

    public String findScoreForScissors(Moves playerTwoMove) {
        if (playerTwoMove.equals(PAPER)) {
            return "scissors wins";
        } else {
            return "rock wins";
        }
    }
}
