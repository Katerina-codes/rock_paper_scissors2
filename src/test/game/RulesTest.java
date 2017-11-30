package test.game;

import main.game.Rules;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RulesTest {

    @Test
    public void scoresADraw() {
        Rules rules = new Rules();

        assertEquals("draw", rules.scoreGame("rock", "rock"));
    }

    @Test
    public void scoresAWinForRockAgainstScissors() {
        Rules rules = new Rules();

        assertEquals("rock wins", rules.scoreGame("rock", "scissors"));
    }

    @Test
    public void scoresLossForRockAgainstPaper() {
        Rules rules = new Rules();

        assertEquals("paper wins", rules.scoreGame("rock", "paper"));
    }

    @Test
    public void scoresLossForPaperAgainstScissors() {
        Rules rules = new Rules();

        assertEquals("scissors wins", rules.scoreGame("scissors", "paper"));
    }
}
