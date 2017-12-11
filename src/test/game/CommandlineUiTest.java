package test.game;

import main.game.*;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
        English englishLanguage = new English();
        CommandlineUi UI = new CommandlineUi(new PrintStream(output), input, englishLanguage);
        UI.askForMoveTwo();

        assertTrue(output.toString().contains("Pick a move. Enter 'rock', 'paper' or 'scissors': "));
    }

    @Test
    public void getMoveFromUser() {
        InputStream input = new ByteArrayInputStream("rock".getBytes());
        CommandlineUi ui = new CommandlineUi(new PrintStream(output), input);

        assertEquals(Moves.ROCK, ui.getMove());
    }

    @Test
    public void announcesWinner() {
        English englishLanguage = new English();
        CommandlineUi UI = new CommandlineUi(new PrintStream(output), input, englishLanguage);
        UI.announceWinnerTwo(Result.PLAYER_ONE_WINS);

        assertTrue(output.toString().contains("Player One"));
    }
}
