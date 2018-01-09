package test.game.Player;

import main.game.Moves.Moves;
import main.game.Player.Computer;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertTrue;

public class ComputerTest {

    @Test
    public void computerPlaysRandomMoveAsAString() {
        Computer computer = new Computer();
        String[] moves = {"rock", "paper", "scissors"};

        String move = computer.playMove();

        assertTrue(Arrays.asList(moves).contains(move));
    }

    @Test
    public void getsAndConvertsMoveFromComputer() {
        Computer computer = new Computer();
        Moves[] moves = Moves.values();

        Moves move = computer.computerMove();

        assertTrue(Arrays.asList(moves).contains(move));
    }
}