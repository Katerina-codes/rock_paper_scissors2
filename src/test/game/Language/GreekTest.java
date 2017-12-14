package test.game.Language;

import main.game.Language.Greek;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GreekTest {

    @Test
    public void promptsForInput() {
        Greek greekLanguage = new Greek();

        assertEquals("Eπιλέξτε την κίνηση σας πληκτρολογώντας 'πέτρα', 'χαρτί' ή 'ψαλίδι': ", greekLanguage.promptForMove());
    }

    @Test
    public void announcesPlayerOneWinner() {
        Greek greekLanguage = new Greek();

        assertTrue(greekLanguage.announceWinner("Player One").contains("Paíktis ένα κερδίζει"));
    }

    @Test
    public void announcesPlayerTwoWinner() {
        Greek greekLanguage = new Greek();

        assertTrue(greekLanguage.announceWinner("Player Two").contains("Paíktis dýo κερδίζει"));
    }

    @Test
    public void announcesDraw() {
        Greek greekLanguage = new Greek();

        assertTrue(greekLanguage.announceWinner("It's a draw!").contains("Είναι ισοπαλία!"));
    }
}