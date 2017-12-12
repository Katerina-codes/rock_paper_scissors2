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
    private Language language;
    private English englishLanguage;
    private CommandlineUi UI;

    @Before
    public void setUp() {
        output = new ByteArrayOutputStream();
        input = new ByteArrayInputStream("".getBytes());
        englishLanguage = new English();
        UI = new CommandlineUi(new PrintStream(output), input);
    }

    @Test
    public void askForLanguage() {
        UI.askForLanguage();

        assertTrue(output.toString().contains("Choose your language:" +
                "Enter '1' for English\n" +
                "Eiságete '2' gia Ελληνικά"));
    }

    @Test
    public void getLanguage() {
        InputStream input = new ByteArrayInputStream("1".getBytes());
        CommandlineUi UI = new CommandlineUi(new PrintStream(output), input);

        assertEquals("1", UI.getLanguage());
    }

    @Test
    public void asksUserToEnterMove() {
        UI.askForMoveTwo();

        assertTrue(output.toString().contains("Pick a move. Enter 'rock', 'paper' or 'scissors': "));
    }

    @Test
    public void getMoveFromUser() {
        InputStream input = new ByteArrayInputStream("rock".getBytes());
        CommandlineUi UI = new CommandlineUi(new PrintStream(output), input);

        assertEquals(Moves.ROCK, UI.getMove());
    }

    @Test
    public void announcesWinner() {
        UI.announceWinnerTwo(Result.PLAYER_ONE_WINS);

        assertTrue(output.toString().contains("Player One"));
    }

    @Test
    public void getEnglishLanguage() {
        Language language = UI.createLanguageOptions("1");
        assertTrue(language instanceof English);
    }

    @Test
    public void getGreekLanguage() {
        Language language = UI.createLanguageOptions("2");
        assertTrue(language instanceof Greek);
    }

    @Test
    public void setLanguageToEnglish() {
        InputStream input = new ByteArrayInputStream("1".getBytes());
        CommandlineUi UI = new CommandlineUi(new PrintStream(output), input);
        Language language = UI.setLanguage();

        assertTrue(language instanceof English);
    }

    @Test
    public void setLanguageToGreek() {
        InputStream input = new ByteArrayInputStream("2".getBytes());
        CommandlineUi UI = new CommandlineUi(new PrintStream(output), input);
        Language language = UI.setLanguage();

        assertTrue(language instanceof Greek);
    }
}
