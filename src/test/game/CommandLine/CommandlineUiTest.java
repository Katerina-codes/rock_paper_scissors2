package test.game.CommandLine;

import main.game.CommandLine.CommandlineUi;
import main.game.Language.English;
import main.game.Language.Greek;
import main.game.Language.Language;
import main.game.Moves.Moves;
import main.game.Result;
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
    public void askForLanguage() {
        ui.askForLanguage();

        assertTrue(output.toString().contains("Enter '1' for English\n" +
                "Eισάγετε '2' για Ελληνικά"));
    }

    @Test
    public void getLanguage() {
        CommandlineUi UI = commandLineWithInput("1");

        assertEquals("1", UI.getLanguage());
    }

    @Test
    public void asksUserToEnterMove() {
        ui.askForMoveTwo();

        assertTrue(output.toString().contains("Pick a move. Enter 'rock', 'paper' or 'scissors': "));
    }

    @Test
    public void getMoveFromUser() {
        CommandlineUi UI = commandLineWithInput("rock");

        assertEquals(Moves.ROCK, UI.getMove());
    }

    @Test
    public void announcesWinner() {
        ui.announceWinnerTwo(Result.PLAYER_ONE_WINS);

        assertTrue(output.toString().contains("Player One"));
    }

    @Test
    public void getEnglishLanguage() {
        Language language = ui.createLanguageOptions("1");
        assertTrue(language instanceof English);
    }

    @Test
    public void getGreekLanguage() {
        Language language = ui.createLanguageOptions("2");
        assertTrue(language instanceof Greek);
    }

    @Test
    public void setLanguageToEnglish() {
        CommandlineUi ui = commandLineWithInput("1");
        ui.setLanguage();
        ui.askForMoveTwo();

        assertTrue(output.toString().contains("Pick a move"));
    }

    @Test
    public void setLanguageToGreek() {
        CommandlineUi ui = commandLineWithInput("2");
        ui.setLanguage();
        ui.askForMoveTwo();

        assertTrue(output.toString().contains("Eπιλέξτε την κίνηση"));
    }

    @Test
    public void translatesRock() {
        CommandlineUi ui = commandLineWithInput("πέτρα");

        assertEquals(Moves.ROCK, ui.getMove());
    }

    @Test
    public void promptsUserForGameMode() {
        CommandlineUi ui = commandLineWithInput("1");
        ui.setLanguage();
        ui.promptForGameMode();

        assertTrue(output.toString().contains("Enter '1' for Human vs. Human\nEnter '2' for Human vs. Computer"));
    }

    private CommandlineUi commandLineWithInput(String userInput) {
        InputStream input = new ByteArrayInputStream(userInput.getBytes());
        return new CommandlineUi(new PrintStream(output), input);
    }
}
