package main.game;

import main.game.CommandLine.Ui;
import main.game.Moves.Moves;
import main.game.Player.Computer;
import main.game.Player.Human;

public class Game {

    private final Ui inputOutput;
    private Rules rules;

    public Game(Ui inputOutput, Rules rules) {
        this.inputOutput = inputOutput;
        this.rules = rules;
    }

    public void runGame() {
        Moves playerOneMove;
        Moves playerTwoMove;

        inputOutput.setLanguage();
        String gameMode = setGameMode();
        Computer computer = new Computer();
        Human human = new Human(inputOutput);

        playerOneMove = human.playMove();

        if (gameMode.equals("1")) {
            playerTwoMove = human.playMove();
        } else {
            playerTwoMove = computer.playMove();
        }
        Result winningMove = rules.findWinningPLayer(playerOneMove, playerTwoMove);
        inputOutput.announceWinner(winningMove);
    }

    private String setGameMode() {
        inputOutput.promptForGameMode();
        return inputOutput.getGameMode();
    }
}