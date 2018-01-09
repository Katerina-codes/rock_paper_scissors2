package test.game.CommandLine;

import main.game.CommandLine.CommandlineUi;
import main.game.Moves.Moves;
import main.game.Result;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static main.game.Moves.Moves.ROCK;
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
                "Eισάγετε '2' για Ελληνικά\n" +
                "Scegli '3' per Italiano"));
    }

    @Test
    public void getLanguage() {
        CommandlineUi UI = commandLineWithInput("1");

        assertEquals("1", UI.getLanguage());
    }

    @Test
    public void asksUserToEnterMove() {
        ui.askForMove();

        assertTrue(output.toString().contains("Pick a move. Enter 'rock', 'paper' or 'scissors': "));
    }

    @Test
    public void getsRockFromUser() {
        CommandlineUi UI = commandLineWithInput("rock");

        assertEquals(ROCK, UI.getMove());
    }

    @Test
    public void getsPaperFromUser() {
        CommandlineUi UI = commandLineWithInput("paper");

        assertEquals(Moves.PAPER, UI.getMove());
    }

    @Test
    public void ifGameModeEquals2HumanPlayerStillMakesAMove() {
        CommandlineUi UI = commandLineWithInput("rock");

        assertEquals(ROCK, UI.getMove());
    }

    @Test
    public void getMoveFromHumanInEnglish() {
        CommandlineUi UI = commandLineWithInput("rock");

        assertEquals(ROCK, UI.getMove());
    }

    @Test
    public void translateGreekMoveToEnglish() {
        CommandlineUi UI = commandLineWithInput("2");
        UI.setLanguage();
        assertEquals(ROCK, UI.translateMove("πέτρα"));
    }

    @Test
    public void announcesWinner() {
        ui.announceWinner(Result.PLAYER_ONE_WINS);

        assertTrue(output.toString().contains("Player One"));
    }

    @Test
    public void setLanguageToEnglish() {
        CommandlineUi ui = commandLineWithInput("1");
        ui.setLanguage();
        ui.askForMove();

        assertTrue(output.toString().contains("Pick a move"));
    }

    @Test
    public void setLanguageToGreek() {
        CommandlineUi ui = commandLineWithInput("2");
        ui.setLanguage();
        ui.askForMove();

        assertTrue(output.toString().contains("Eπιλέξτε την κίνηση"));
    }

    @Test
    public void translatesRock() {
        CommandlineUi ui = commandLineWithInput("2\nπέτρα");
        ui.setLanguage();

        assertEquals(ROCK, ui.getMove());
    }

    @Test
    public void promptsUserForGameModeInEnglish() {
        CommandlineUi ui = commandLineWithInput("1");
        ui.setLanguage();
        ui.promptForGameMode();

        assertTrue(output.toString().contains("Enter '1' for Human vs. Human\nEnter '2' for Human vs. Computer"));
    }

    @Test
    public void getGameMode() {
        CommandlineUi ui = commandLineWithInput("1");

        assertEquals("1", ui.getGameMode());
    }

    private CommandlineUi commandLineWithInput(String userInput) {
        InputStream input = new ByteArrayInputStream(userInput.getBytes());
        return new CommandlineUi(new PrintStream(output), input);
    }
}
