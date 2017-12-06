package main.game;

import java.io.*;
import java.util.HashMap;

public class CommandlineUi implements Ui {

    private final PrintStream output;
    private final BufferedReader input;
    private HashMap convertedMove;

    public CommandlineUi(PrintStream output, InputStream input) {
        this.output = output;
        this.input = new BufferedReader(new InputStreamReader(input));
        convertedMove = new HashMap<>();
        convertedMove.put("rock", Moves.ROCK);
        convertedMove.put("paper", Moves.PAPER);
        convertedMove.put("scissors", Moves.SCISSORS);
    }

    public void askForMove() {
        output.println("Pick a move. Enter 'rock', 'paper' or 'scissors': ");
    }

    public String getsMove() {
        String userMove = null;
        try {
            userMove = input.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userMove;
    }

    public Moves getsMoveTwo() {
        String userMove = null;
        try {
            userMove = input.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Moves convertedUserMove = convertMove(userMove);
        return convertedUserMove;
    }

    public Moves convertMove(String userMove) {
        return (Moves) convertedMove.get(userMove);
    }

    public String convertWinningMove(Result winningMove) {
        HashMap<Result, String> convertedResult = new HashMap<>();
        convertedResult.put(Result.PLAYER_ONE_WINS, "Player one wins!");
        convertedResult.put(Result.PLAYER_TWO_WINS, "Player two wins!");
        convertedResult.put(Result.DRAW, "It's a draw!");

        return convertedResult.get(winningMove);
    }

    public void announceWinner(String winningMove) {
        output.println(String.format("%s wins!", winningMove));
    }

    public void announceWinnerTwo(Result winningMove) {
        String convertedWinningMove = convertWinningMove(winningMove);
        output.println(String.format("%s wins!", convertedWinningMove));
    }

}
