package main.game;

import java.io.*;

public class CommandlineUi implements Ui {

    private final PrintStream output;
    private final BufferedReader input;

    public CommandlineUi(PrintStream output, InputStream input) {
        this.output = output;
        this.input = new BufferedReader(new InputStreamReader(input));
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

    public void announceWinner(String winningMove) {
         output.println(String.format("%s wins!", winningMove));
    }
}
