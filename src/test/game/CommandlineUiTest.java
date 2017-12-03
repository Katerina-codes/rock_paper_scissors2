package test.game;

import main.game.CommandlineUi;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class CommandlineUiTest {

    @Test
    public void asksUserToEnterMove() {
        CommandlineUi ui = new CommandlineUi();

        assertEquals("Pick a move. Enter 'rock', 'paper' or 'scissors': ", ui.askForMove());
    }

    @Test
    public void getMoveFromUser() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        InputStream input = new ByteArrayInputStream("rock".getBytes());
        CommandlineUi ui = new CommandlineUi(new PrintStream(output), input);

        assertEquals("rock", ui.getsMove());
    }

    @Test
    public void announcesWinner() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        InputStream input = new ByteArrayInputStream("".getBytes());
        CommandlineUi ui = new CommandlineUi(new PrintStream(output), input);

        assertEquals("rock wins!", ui.announceWinner("rock"));
    }
}
