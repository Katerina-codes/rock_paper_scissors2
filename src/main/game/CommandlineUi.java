package main.game;

import java.io.*;
import java.util.HashMap;

public class CommandlineUi implements Ui {

    private final PrintStream output;
    private final BufferedReader input;
    private Language language;
    private HashMap<String, Moves> moves;
    private HashMap<Result, String> results;


    public CommandlineUi(PrintStream output, InputStream input, Language language) {
        this.output = output;
        this.input = new BufferedReader(new InputStreamReader(input));
        this.language = language;
        createMoveOptions();
        createResultOptions();
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
        return convertMove(userMove);
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

    public void askForLanguage() {
        output.println(language.askForLanguage());
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

    public Language createLanguageOptions(String userChoice) {
        return new English();
    }
}