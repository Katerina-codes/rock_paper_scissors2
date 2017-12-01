package test.game;

import main.game.CommandlineUi;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommandlineUiTest {

    @Test
    public void asksUserToEnterMove() {
        CommandlineUi ui = new CommandlineUi();

        assertEquals("Pick a move. Enter 'rock', 'paper' or 'scissors': ", ui.askForMove());
    }
}
