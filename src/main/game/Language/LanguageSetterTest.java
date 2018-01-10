package main.game.Language;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LanguageSetterTest {

    @Test
    public void LanguageIsSetToEnglish() {
        LanguageSetter languageSetter = new LanguageSetter();

        assertTrue(languageSetter.setLanguage("1") instanceof English);
    }

    @Test
    public void LanguageIsSetToGreek() {
        LanguageSetter languageSetter = new LanguageSetter();

        assertTrue(languageSetter.setLanguage("2") instanceof Greek);
    }

    @Test
    public void LanguageIsSetToItalian() {
        LanguageSetter languageSetter = new LanguageSetter();

        assertTrue(languageSetter.setLanguage("3") instanceof Italian);
    }
}