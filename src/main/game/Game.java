package main.game;

public class Game {

    private final Ui inputOutput;

    public Game(Ui inputOutput) {
        this.inputOutput = inputOutput;
    }

    public void runGame() {
        inputOutput.askForMove();
    }
}
