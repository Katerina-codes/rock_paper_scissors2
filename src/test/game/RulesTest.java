package test.game;

import main.game.Moves.Move;
import main.game.Moves.Paper;
import main.game.Moves.Rock;
import main.game.Moves.Scissors;
import main.game.Result;
import main.game.Rules;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static main.game.Moves.Moves.*;
import static main.game.Result.DRAW;
import static org.junit.Assert.assertEquals;

public class RulesTest {

    private Map moves;
    private Rules rules;

    @Before
    public void setUp() {
        moves = new HashMap<>();
        Move rockMove = new Rock();
        Move paperMove = new Paper();
        Move scissorsMove = new Scissors();
        moves.put(ROCK, rockMove);
        moves.put(PAPER, paperMove);
        moves.put(SCISSORS, scissorsMove);
        rules = new Rules(moves);
    }

    @Test
    public void scoresADraw() {
        assertEquals(DRAW, rules.findWinningPLayer(ROCK, ROCK));
    }

    @Test
    public void scoresAWinForRockAgainstScissors() {
        assertEquals(ROCK, rules.scoreMove(ROCK, SCISSORS));
        assertEquals(ROCK, rules.scoreMove(SCISSORS, ROCK));
    }

    @Test
    public void scoresLossForRockAgainstPaper() {
        assertEquals(PAPER, rules.scoreMove(ROCK, PAPER));
        assertEquals(PAPER, rules.scoreMove(PAPER, ROCK));
    }

    @Test
    public void scoresLossForPaperAgainstScissors() {
        assertEquals(SCISSORS, rules.scoreMove(SCISSORS, PAPER));
        assertEquals(SCISSORS, rules.scoreMove(PAPER, SCISSORS));
    }

    @Test
    public void playerOneWinsWhenPlayerOneIsScissorsAndWinningMoveIsScissors() {
        assertEquals(Result.PLAYER_ONE_WINS, rules.scoreGame(SCISSORS, SCISSORS));
    }

    @Test
    public void playerOneWinsWhenPlayerTwoIsScissorsAndWinningMoveIsScissors() {
        assertEquals(Result.PLAYER_TWO_WINS, rules.scoreGame(PAPER, SCISSORS));
    }
}
