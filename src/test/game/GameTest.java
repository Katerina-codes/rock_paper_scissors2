package test.game;

import main.game.Game;
import main.game.Moves.Move;
import main.game.Moves.Paper;
import main.game.Moves.Rock;
import main.game.Moves.Scissors;
import main.game.Rules;
import org.junit.Before;
import org.junit.Test;
import test.game.CommandLine.FakeCommandlineUi;

import java.util.HashMap;
import java.util.Map;

import static main.game.Moves.Moves.*;
import static org.junit.Assert.assertTrue;

public class GameTest {

    private Map moves;

    @Before
    public void setUp() {
        moves = new HashMap<>();
        Move rockMove = new Rock();
        Move paperMove = new Paper();
        Move scissorsMove = new Scissors();
        moves.put(ROCK, rockMove);
        moves.put(PAPER, paperMove);
        moves.put(SCISSORS, scissorsMove);
    }

    @Test
    public void runsGame() {
        FakeCommandlineUi inputOutput = new FakeCommandlineUi();
        Rules rules = new Rules(moves);
        Game game = new Game(inputOutput, rules);

        game.runGame();

        assertTrue(inputOutput.promptForGameModeWasCalled());
        assertTrue(inputOutput.getGameModeWasCalled());
        assertTrue(inputOutput.setUserLanguageWasCalled());
        assertTrue(inputOutput.askForMoveTwoWasCalled());
        assertTrue(inputOutput.getMoveWasCalled());
        assertTrue(inputOutput.announceWinnerTwoWasCalled());
    }
}
