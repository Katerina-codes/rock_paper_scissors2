package main.game.Player;

import main.game.Moves.Moves;

import java.util.Random;

public class Computer {

    public static Moves playMove() {
        return Moves.getRandomMove();
    }

    public String playMoveTwo() {
        String[] moves = {"rock", "paper", "scissors"};
        Random random = new Random();
        int randomMove = random.nextInt(moves.length);
        return moves[randomMove];
    }
}
