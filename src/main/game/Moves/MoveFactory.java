package main.game.Moves;

import java.util.HashMap;
import java.util.Map;

import static main.game.Moves.Moves.*;

public class MoveFactory {

    private Map moves;

    public Map getMoves() {
        moves = new HashMap<>();
        Move rockMove = new Rock();
        Move paperMove = new Paper();
        Move scissorsMove = new Scissors();
        moves.put(ROCK, rockMove);
        moves.put(PAPER, paperMove);
        moves.put(SCISSORS, scissorsMove);
        return moves;
    }
}
