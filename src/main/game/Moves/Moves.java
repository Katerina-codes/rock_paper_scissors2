package main.game.Moves;

import java.util.HashMap;
import java.util.Random;

public enum Moves {
    ROCK,
    PAPER,
    SCISSORS;

    public static Moves getRandomMove() {
        Moves[] moves = Moves.values();
        Random random = new Random();
        int randomMove = random.nextInt(moves.length);
        return moves[randomMove];
    }

    public static Moves getMove(String move) {
        HashMap<String, Moves> moves = new HashMap<>();
        moves.put("rock", Moves.ROCK);
        moves.put("paper", Moves.PAPER);
        moves.put("scissors", Moves.SCISSORS);
        return (Moves) moves.get(move);
    }
}