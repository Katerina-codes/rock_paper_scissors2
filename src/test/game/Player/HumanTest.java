package test.game.Player;

import main.game.CommandLine.CommandlineUi;
import main.game.Player.Human;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static main.game.Moves.Moves.ROCK;
import static org.junit.Assert.assertEquals;

public class HumanTest {

    @Test
    public void HumanPlayerMakesAMove() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        ByteArrayInputStream input = new ByteArrayInputStream("rock".getBytes());
        CommandlineUi inputOutput = new CommandlineUi(new PrintStream(output), input);
        Human human = new Human(inputOutput);
        assertEquals(ROCK, human.playMove());
    }
}
