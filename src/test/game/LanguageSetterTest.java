package test.game;

import main.game.Language.English;
import main.game.Language.LanguageSetter;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LanguageSetterTest {

    @Test
    public void TestLanguageIsSetToEnglish() {
        LanguageSetter languageSetter = new LanguageSetter();

        assertTrue(languageSetter.setLanguage("1") instanceof English);
    }
}
