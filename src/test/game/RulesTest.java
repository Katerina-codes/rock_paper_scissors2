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

        assertEquals(DRAW.getResult(), rules.scoreGameTwo(ROCK, ROCK));
    }

    @Test
    public void scoresAWinForRockAgainstScissors() {
        Rules rules = new Rules(moves);

        assertEquals(ROCK.getMove(), rules.scoreGameTwo(ROCK, SCISSORS));
        assertEquals(ROCK.getMove(), rules.scoreGameTwo(SCISSORS, ROCK));
    }

    @Test
    public void scoresLossForRockAgainstPaper() {
        Rules rules = new Rules(moves);

        assertEquals(PAPER.getMove(), rules.scoreGameTwo(ROCK, PAPER));
        assertEquals(PAPER.getMove(), rules.scoreGameTwo(PAPER, ROCK));
    }

    @Test
    public void scoresLossForPaperAgainstScissors() {
        Rules rules = new Rules(moves);

        assertEquals(SCISSORS.getMove(), rules.scoreGameTwo(SCISSORS, PAPER));
        assertEquals(SCISSORS.getMove(), rules.scoreGameTwo(PAPER, SCISSORS));
    }
}
