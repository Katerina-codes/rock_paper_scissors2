package main.game.Player;

import java.util.Random;

public class Computer {

    public static String playMove() {
        String[] moves = {"rock", "paper", "scissors"};
        Random random = new Random();
        int randomMove = random.nextInt(moves.length);
        return moves[randomMove];
    }
}
