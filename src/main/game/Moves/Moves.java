package main.game.Moves;

import java.util.HashMap;

public enum Moves {
    ROCK,
    PAPER,
    SCISSORS;

    public static Moves getMove(String move) {
        HashMap<String, Moves> moves = new HashMap<>();
        moves.put("rock", Moves.ROCK);
        moves.put("paper", Moves.PAPER);
        moves.put("scissors", Moves.SCISSORS);
        return moves.get(move);
    }
}