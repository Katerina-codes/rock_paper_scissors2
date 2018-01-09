package main.game.Player;

import main.game.Moves.Moves;

import java.util.Random;

public class Computer {

    public static String playMove() {
        String[] moves = {"rock", "paper", "scissors"};
        Random random = new Random();
        int randomMove = random.nextInt(moves.length);
        return moves[randomMove];
    }

    public Moves computerMove() {
        String move = Computer.playMove();
        return Moves.getMove(move);
    }
}
