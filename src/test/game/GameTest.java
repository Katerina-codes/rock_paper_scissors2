package test.game;

import main.game.*;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static main.game.Moves.*;
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

        game.runGameTwo();

        assertTrue(inputOutput.setUserLanguageWasCalled());
        assertTrue(inputOutput.askForMoveTwoWasCalled());
        assertTrue(inputOutput.getsMoveFromUserWasCalled());
        assertTrue(inputOutput.announceWinnerTwoWasCalled());
    }
}
