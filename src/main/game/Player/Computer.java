package main.game.Player;

import main.game.Moves.Moves;

public class Computer {

    public static Moves playMove() {
       return Moves.getRandomMove();
    }
}
