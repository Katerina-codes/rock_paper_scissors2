package test.game.Language;

import main.game.Language.Italian;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItalianTest {

    @Test
    public void promptPlayerForMove() {
        Italian italian = new Italian();

        assertEquals(italian.promptForMove(), "Scegli una mossa: ‘sasso’, ‘carta’ o ‘forbici’: ");
    }
}
