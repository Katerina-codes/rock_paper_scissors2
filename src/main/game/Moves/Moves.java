package main.game.Moves;

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
}