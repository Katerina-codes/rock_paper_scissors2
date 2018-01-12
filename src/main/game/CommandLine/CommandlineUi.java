package main.game.CommandLine;

import main.game.Language.English;
import main.game.Language.Language;
import main.game.Language.LanguageSetter;
import main.game.Moves.Moves;
import main.game.Result;

import java.io.*;

public class CommandlineUi implements Ui {

    private final PrintStream output;
    private final BufferedReader input;
    private Language language;

    public CommandlineUi(PrintStream output, InputStream input) {
        this.output = output;
        this.input = new BufferedReader(new InputStreamReader(input));
        this.language = new English();
    }

    public void askForMove() {
        output.println(language.promptForMove());
    }

    public Moves playMove() {
        String move = null;
        try {
            move = input.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return translateMove(move);
    }

    public String getLanguage() {
        String userChoice = null;
        try {
            userChoice = input.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userChoice;
    }

    public void setLanguage() {
        askForLanguage();
        String userChoice = getLanguage();
        this.language = LanguageSetter.setLanguage(userChoice);
    }

    public void promptForGameMode() {
        output.println(language.promptForGameMode());
    }

    public String getGameMode() {
        String gameMode = null;
        try {
            return input.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return gameMode;
    }

    public void askForLanguage() {
        English english = new English();
        output.println(english.askForLanguage());
    }

    public Moves translateMove(String move) {
        return language.translateToEnglish(move);
    }

    public void announceWinnerTwo(Result result) {
        if (result.equals(Result.PLAYER_ONE_WINS)) {
            output.println(language.announcePlayerOneWin());
        } else if (result.equals(Result.PLAYER_TWO_WINS)){
            output.println(language.announcePlayerTwoWin());
        } else {
            output.println(language.announceDraw());
        }
    }
}