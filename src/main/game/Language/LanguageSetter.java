package main.game.Language;

public class LanguageSetter {
    public Language setLanguage(String userChoice) {
        if (userChoice.equals("1")) {
            return new English();
        } else {
            return new Greek();
        }
    }
}
