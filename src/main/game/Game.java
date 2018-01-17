package main.game;

import main.game.CommandLine.Ui;
import main.game.Language.GameFactory;
import main.game.Moves.Moves;
import main.game.Player.Player;

import java.util.List;

public class Game {

    private final Ui inputOutput;
    private Rules rules;

    public Game(Ui inputOutput, Rules rules) {
        this.inputOutput = inputOutput;
        this.rules = rules;
    }

    public void runGame() {
        inputOutput.setLanguage();
        String gameMode = setGameMode();
        GameFactory gameType = new GameFactory(inputOutput);

        List<Player> playerTypes = gameType.getPlayerTypes(gameMode);
        Moves playerOneMove = playerTypes.get(0).playMove();
        Moves playerTwoMove = playerTypes.get(1).playMove();

        Result winningMove = rules.findWinningPLayer(playerOneMove, playerTwoMove);
        inputOutput.announceWinner(winningMove);
    }

    private String setGameMode() {
        inputOutput.promptForGameMode();
        return inputOutput.getGameMode();
    }
}