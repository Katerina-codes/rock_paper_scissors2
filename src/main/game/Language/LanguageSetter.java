package main.game.Language;

public class LanguageSetter {
    public static Language setLanguage(String userChoice) {
        if (userChoice.equals("1")) {
            return new English();
        } else if (userChoice.equals("2")) {
            return new Greek();
        } else {
            return new Italian();
        }
    }
}
