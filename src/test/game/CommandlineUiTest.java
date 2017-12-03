package test.game;

import main.game.CommandlineUi;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class CommandlineUiTest {

    private ByteArrayOutputStream output;
    private InputStream input;
    private CommandlineUi ui;

    @Before
    public void setUp() {
        output = new ByteArrayOutputStream();
        input = new ByteArrayInputStream("".getBytes());
        ui = new CommandlineUi(new PrintStream(output), input);
    }

    @Test
    public void asksUserToEnterMove() {
        assertEquals("Pick a move. Enter 'rock', 'paper' or 'scissors': ", ui.askForMove());
    }

    @Test
    public void getMoveFromUser() {
        InputStream input = new ByteArrayInputStream("rock".getBytes());
        CommandlineUi ui = new CommandlineUi(new PrintStream(output), input);

        assertEquals("rock", ui.getsMove());
    }

    @Test
    public void announcesWinner() {
        assertEquals("rock wins!", ui.announceWinner("rock"));
    }
}
