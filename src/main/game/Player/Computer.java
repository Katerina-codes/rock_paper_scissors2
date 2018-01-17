package main.game.Player;

import main.game.Moves.Moves;

import java.util.Random;

public class Computer implements Player {

    public static String computerMove() {
        String[] moves = {"rock", "paper", "scissors"};
        Random random = new Random();
        int randomMove = random.nextInt(moves.length);
        return moves[randomMove];
    }

    public Moves playMove() {
        String move = Computer.computerMove();
        return Moves.getMove(move);
    }
}
