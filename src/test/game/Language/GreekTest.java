package test.game.Language;

import main.game.Language.Greek;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GreekTest {

    private Greek greekLanguage;

    @Before
    public void setUp() {
        greekLanguage = new Greek();
    }

    @Test
    public void promptsForInput() {
        assertEquals("Eπιλέξτε την κίνηση σας πληκτρολογώντας 'πέτρα', 'χαρτί' ή 'ψαλίδι': ", greekLanguage.promptForMove());
    }

    @Test
    public void announcesPlayerOneWinner() {
        assertTrue(greekLanguage.announcePlayerOneWin().contains("Paíktis ένα κερδίζει"));
    }

    @Test
    public void announcesPlayerTwoWinner() {
        assertTrue(greekLanguage.announcePlayerTwoWin().contains("Paíktis dýo κερδίζει"));
    }

    @Test
    public void announcesDraw() {
        assertTrue(greekLanguage.announceDraw().contains("Είναι ισοπαλία!"));
    }
}