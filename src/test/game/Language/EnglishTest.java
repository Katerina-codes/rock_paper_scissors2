package test.game.Language;

import main.game.Language.English;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class EnglishTest {

    private English english;

    @Before
    public void setUp() {
        english = new English();
    }


    @Test
    public void promptPlayerForMove() {
        assertEquals("Pick a move. Enter 'rock', 'paper' or 'scissors': ", english.promptForMove());
    }

    @Test
    public void announcePlayerOneWin() {
        assertEquals("Player One wins!", english.announcePlayerOneWin());
    }

    @Test
    public void announcePlayerTwoWin() {
        assertEquals("Player Two wins!", english.announcePlayerTwoWin());
    }

    @Test
    public void askForLanguage() {
        assertTrue(english.askForLanguage().contains("Enter '1' for English"));
    }

    @Test
    public void announceDraw() {
        assertEquals("It's a draw!", english.announceDraw());
    }
}
