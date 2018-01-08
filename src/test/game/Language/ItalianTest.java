package test.game.Language;

import main.game.Language.Italian;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItalianTest {

    @Test
    public void promptPlayerForMove() {
        Italian italian = new Italian();

        assertEquals("Scegli una mossa: ‘sasso’, ‘carta’ o ‘forbici’: ", italian.promptForMove());
    }

    @Test
    public void announcePlayerOneWinner() {
        Italian italian = new Italian();

        assertEquals("Il giocatore numero uno vince!", italian.announceWinner("Il giocatore numero uno"));
    }

    @Test
    public void announcePlayerTwoWinner() {
        Italian italian = new Italian();

        assertEquals("Il giocatore numero due vince!", italian.announceWinner("Il giocatore numero due"));
    }

    @Test
    public void drawIsScoredCorrectly() {
        Italian italian = new Italian();

        assertEquals("E'patta!", italian.announceWinner("patta"));
    }
}
