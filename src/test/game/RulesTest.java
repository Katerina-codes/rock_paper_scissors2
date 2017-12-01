package test.game;

import main.game.*;
import org.junit.Test;

import java.util.HashMap;

import static main.game.Moves.*;
import static main.game.Result.DRAW;
import static org.junit.Assert.assertEquals;

public class RulesTest {

    @Test
    public void scoresADraw() {
        HashMap<Moves, Move> moves = new HashMap<>();
        Move rockMove = new Rock();
        Move paperMove = new Paper();
        Move scissorsMove = new Scissors();
        moves.put(ROCK, rockMove);
        moves.put(PAPER, paperMove);
        moves.put(SCISSORS, scissorsMove);

        Rules rules = new Rules(moves);

        assertEquals(DRAW.getResult(), rules.scoreGameTwo(ROCK, ROCK));
    }

    @Test
    public void scoresAWinForRockAgainstScissors() {
        Rules rules = new Rules();

        assertEquals(ROCK.getMove(), rules.scoreGame(ROCK, SCISSORS));
        assertEquals(ROCK.getMove(), rules.scoreGame(SCISSORS, ROCK));
    }

    @Test
    public void scoresLossForRockAgainstPaper() {
        Rules rules = new Rules();

        assertEquals(PAPER.getMove(), rules.scoreGame(ROCK, PAPER));
        assertEquals(PAPER.getMove(), rules.scoreGame(PAPER, ROCK));
    }

    @Test
    public void scoresLossForPaperAgainstScissors() {
        Rules rules = new Rules();

        assertEquals(SCISSORS.getMove(), rules.scoreGame(SCISSORS, PAPER));
        assertEquals(SCISSORS.getMove(), rules.scoreGame(PAPER, SCISSORS));
    }
}
