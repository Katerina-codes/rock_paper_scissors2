package main.game.CommandLine;

import main.game.Game;
import main.game.Moves.MoveFactory;
import main.game.Rules;

public class GameRunner {
    public static void main(String[] args) {
        CommandlineUi inputOutput = new CommandlineUi(System.out, System.in);
        MoveFactory moves = new MoveFactory();
        Rules rules = new Rules(moves.getMoves());
        Game game = new Game(inputOutput, rules);

        game.runGame();
    }
}