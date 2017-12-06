package test.game;

import main.game.*;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static main.game.Moves.*;
import static main.game.Result.DRAW;
import static org.junit.Assert.assertEquals;

public class RulesTest {

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
    public void scoresADraw() {

        Rules rules = new Rules(moves);

        assertEquals(DRAW, rules.findWinningPLayer(ROCK, ROCK));
    }

    @Test
    public void scoresAWinForRockAgainstScissors() {
        Rules rules = new Rules(moves);

        assertEquals(ROCK, rules.scoreMove(ROCK, SCISSORS));
        assertEquals(ROCK, rules.scoreMove(SCISSORS, ROCK));
    }

    @Test
    public void scoresLossForRockAgainstPaper() {
        Rules rules = new Rules(moves);

        assertEquals(PAPER, rules.scoreMove(ROCK, PAPER));
        assertEquals(PAPER, rules.scoreMove(PAPER, ROCK));
    }

    @Test
    public void scoresLossForPaperAgainstScissors() {
        Rules rules = new Rules(moves);

        assertEquals(SCISSORS, rules.scoreMove(SCISSORS, PAPER));
        assertEquals(SCISSORS, rules.scoreMove(PAPER, SCISSORS));
    }

    @Test
    public void playerOneWinsWhenPlayerOneIsScissorsAndWinningMoveIsScissors() {
        Rules rules = new Rules(moves);

        assertEquals(Result.PLAYER_ONE_WINS, rules.scoreGame(SCISSORS, SCISSORS));
    }

    @Test
    public void playerOneWinsWhenPlayerTwoIsScissorsAndWinningMoveIsScissors() {
        Rules rules = new Rules(moves);

        assertEquals(Result.PLAYER_TWO_WINS, rules.scoreGame(PAPER, SCISSORS));
    }
}
