package test.game;

import main.game.Rules;
import org.junit.Test;

import static main.game.Moves.*;
import static org.junit.Assert.assertEquals;

public class RulesTest {

    @Test
    public void scoresADraw() {
        Rules rules = new Rules();

        assertEquals("draw", rules.scoreGame(ROCK, ROCK));
    }

    @Test
    public void scoresAWinForRockAgainstScissors() {
        Rules rules = new Rules();

        assertEquals("rock wins", rules.scoreGame(ROCK, SCISSORS));
        assertEquals("rock wins", rules.scoreGame(SCISSORS, ROCK));
    }

    @Test
    public void scoresLossForRockAgainstPaper() {
        Rules rules = new Rules();

        assertEquals("paper wins", rules.scoreGame(ROCK, PAPER));
        assertEquals("paper wins", rules.scoreGame(PAPER, ROCK));
    }

    @Test
    public void scoresLossForPaperAgainstScissors() {
        Rules rules = new Rules();

        assertEquals("scissors wins", rules.scoreGame(SCISSORS, PAPER));
        assertEquals("scissors wins", rules.scoreGame(PAPER, SCISSORS));
    }
}
