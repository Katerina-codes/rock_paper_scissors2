package test.game.Language;

import main.game.Language.English;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EnglishTest {

    @Test
    public void promptPlayerForMove() {
        English english = new English();

        assertEquals("Pick a move. Enter 'rock', 'paper' or 'scissors': ", english.promptForMove());
    }
}
