package main.game;

import java.io.*;

public class CommandlineUi {

    private PrintStream output;
    private BufferedReader input;

    public CommandlineUi() {

    }

    public CommandlineUi(PrintStream output, InputStream input) {
        this.output = output;
        this.input = new BufferedReader(new InputStreamReader(input));
    }

    public String askForMove() {
        return "Pick a move. Enter 'rock', 'paper' or 'scissors': ";
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
}
