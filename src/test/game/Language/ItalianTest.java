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
    public void announceWinner() {
        Italian italian = new Italian();

        assertEquals("Il giocatore numero uno vince!", italian.announceWinner("Il giocatore numero uno"));
    }
}
