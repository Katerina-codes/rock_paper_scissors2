package main.game.CommandLine;

import main.game.Language.English;
import main.game.Language.Language;
import main.game.Language.LanguageSetter;
import main.game.Moves.Moves;
import main.game.Result;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CommandlineUi implements Ui {

    private final PrintStream output;
    private final BufferedReader input;
    private Language language;
    private Map<Result, String> results;

    public CommandlineUi(PrintStream output, InputStream input) {
        this.output = output;
        this.input = new BufferedReader(new InputStreamReader(input));
        createResultOptions();
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

    public String convertWinningMove(Result winningMove) {
        return results.get(winningMove);
    }

    public void announceWinner(Result winningMove) {
        String convertedWinningMove = convertWinningMove(winningMove);
        output.println(language.announceWinner(convertedWinningMove));
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

    private void createResultOptions() {
        results = new HashMap<>();
        results.put(Result.PLAYER_ONE_WINS, "Player One");
        results.put(Result.PLAYER_TWO_WINS, "Player Two");
        results.put(Result.DRAW, "It's a draw!");
    }

    public Moves translateMove(String move) {
        return language.translateToEnglish(move);
    }

    public void announceWinnerTwo(Result result) {
        if (result.equals(Result.PLAYER_ONE_WINS)) {
            output.println(language.announcePlayerOneWin());
        } else {
            output.println(language.announcePlayerTwoWin());
        }
    }
}