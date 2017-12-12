package main.game.CommandLine;

import main.game.Language.English;
import main.game.Language.Greek;
import main.game.Language.Language;
import main.game.Moves.Moves;
import main.game.Result;
import main.game.Ui;

import java.io.*;
import java.util.HashMap;

public class CommandlineUi implements Ui {

    private final PrintStream output;
    private final BufferedReader input;
    private Language language;
    private HashMap<String, Moves> moves;
    private HashMap<Result, String> results;
    private HashMap<String, String> translations;

    public CommandlineUi(PrintStream output, InputStream input) {
        this.output = output;
        this.input = new BufferedReader(new InputStreamReader(input));
        createMoveOptions();
        createResultOptions();
        translateToEnglish();
        this.language = new English();
    }

    public void askForMoveTwo() {
        output.println(language.promptForMove());
    }

    public Moves getMove() {
        String userMove = null;
        try {
            userMove = input.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (userMove.equals("rock") || userMove.equals("paper") || userMove.equals("scissors")) {
            return convertMove(userMove);
        } else {
            String translatedMove = translations.get(userMove);
            return convertMove(translatedMove);
        }
    }

    public Moves convertMove(String userMove) {
        return moves.get(userMove);
    }

    public String convertWinningMove(Result winningMove) {
        return results.get(winningMove);
    }

    public void announceWinnerTwo(Result winningMove) {
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

    public void setUserLanguage() {
        setLanguage();
    }

    public Language createLanguageOptions(String userChoice) {
        if (userChoice.equals("1")) {
            return new English();
        } else {
            return new Greek();
        }
    }

    public Language setLanguage() {
        askForLanguage();
        String userChoice = getLanguage();
        this.language = createLanguageOptions(userChoice);
        return this.language;
    }

    public void askForLanguage() {
        English english = new English();
        output.println(english.askForLanguage());
    }

    private void translateToEnglish() {
        translations = new HashMap<>();
        translations.put("πέτρα", "rock");
        translations.put("χαρτί", "paper");
        translations.put("ψαλίδι", "scissors");
    }

    private void createMoveOptions() {
        moves = new HashMap<>();
        moves.put("rock", Moves.ROCK);
        moves.put("paper", Moves.PAPER);
        moves.put("scissors", Moves.SCISSORS);
    }

    private void createResultOptions() {
        results = new HashMap<>();
        results.put(Result.PLAYER_ONE_WINS, "Player One");
        results.put(Result.PLAYER_TWO_WINS, "Player Two");
        results.put(Result.DRAW, "It's a draw!");
    }
}