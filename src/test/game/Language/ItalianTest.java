package test.game.Language;

import main.game.Language.Italian;
import org.junit.Before;
import org.junit.Test;

import static main.game.Moves.Moves.PAPER;
import static main.game.Moves.Moves.ROCK;
import static org.junit.Assert.assertEquals;

public class ItalianTest {

    private Italian italian;

    @Before
    public void setUp() {
        italian = new Italian();
    }

    @Test
    public void promptPlayerForMove() {
        assertEquals("Scegli una mossa: ‘sasso’, ‘carta’ o ‘forbici’: ", italian.promptForMove());
    }

    @Test
    public void announcePlayerOneWinner() {
        assertEquals("Il giocatore numero uno vince!", italian.announcePlayerOneWin());
    }

    @Test
    public void announcePlayerTwoWinner() {
        assertEquals("Il giocatore numero due vince!", italian.announcePlayerTwoWin());
    }

    @Test
    public void drawIsScoredCorrectly() {
        assertEquals("E'patta!", italian.announceDraw());
    }

    @Test
    public void promptsForGameMode() {
        assertEquals("Inserisci '1' per Umani contro Umani\nInserisci '2' per Uomo contro Computer", italian.promptForGameMode());
    }

    @Test
    public void translatesRockMoveToEnglish() {
        assertEquals(ROCK, italian.translateToEnglish("sasso"));
    }

    @Test
    public void translatesPaperMoveToEnglish() {
        assertEquals(PAPER, italian.translateToEnglish("carta"));
    }
}
