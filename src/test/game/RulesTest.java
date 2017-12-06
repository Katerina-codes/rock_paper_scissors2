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

        assertEquals(DRAW.getResult(), rules.scoreGame(ROCK, ROCK));
    }

    @Test
    public void scoresAWinForRockAgainstScissors() {
        Rules rules = new Rules(moves);

        assertEquals(ROCK.getMove(), rules.scoreGame(ROCK, SCISSORS));
        assertEquals(ROCK.getMove(), rules.scoreGame(SCISSORS, ROCK));
    }

    @Test
    public void scoresLossForRockAgainstPaper() {
        Rules rules = new Rules(moves);

        assertEquals(PAPER.getMove(), rules.scoreGame(ROCK, PAPER));
        assertEquals(PAPER.getMove(), rules.scoreGame(PAPER, ROCK));
    }

    @Test
    public void scoresLossForPaperAgainstScissors() {
        Rules rules = new Rules(moves);

        assertEquals(SCISSORS.getMove(), rules.scoreGame(SCISSORS, PAPER));
        assertEquals(SCISSORS.getMove(), rules.scoreGame(PAPER, SCISSORS));
    }

    @Test
    public void playerOneWinsWhenPlayerOneIsScissorsAndWinningMoveIsScissors() {
        Rules rules = new Rules(moves);

        assertEquals(Result.PLAYER_ONE_WINS, rules.findWinningPlayer(SCISSORS, SCISSORS));
    }

    @Test
    public void playerOneWinsWhenPlayerTwoIsScissorsAndWinningMoveIsScissors() {
        Rules rules = new Rules(moves);

        assertEquals(Result.PLAYER_TWO_WINS, rules.findWinningPlayer(PAPER, SCISSORS));
    }
}
