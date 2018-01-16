package test.game.Language;

import main.game.Language.English;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class EnglishTest {

    @Test
    public void promptPlayerForMove() {
        English english = new English();

        assertEquals("Pick a move. Enter 'rock', 'paper' or 'scissors': ", english.promptForMove());
    }

    @Test
    public void announcePlayerOneWin() {
        English english = new English();

        assertEquals("Player One wins!", english.announcePlayerOneWin());
    }

    @Test
    public void announcePlayerTwoWin() {
        English english = new English();

        assertEquals("Player Two wins!", english.announcePlayerTwoWin());
    }

    @Test
    public void askForLanguage() {
        English english = new English();

        assertTrue(english.askForLanguage().contains("Enter '1' for English"));
    }

    @Test
    public void announceDraw() {
        English english = new English();

        assertEquals("It's a draw!", english.announceDraw());
    }
}
