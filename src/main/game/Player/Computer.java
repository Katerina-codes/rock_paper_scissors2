package main.game.Player;

import main.game.Moves.Moves;

public class Computer {

    public Moves playMove() {
       return Moves.getRandomMove();
    }
}
