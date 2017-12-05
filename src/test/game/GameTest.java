package test.game;

import main.game.Game;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GameTest {
    @Test
    public void runsTheGame() {
       FakeCommandlineUi ui = new FakeCommandlineUi();
       Game game = new Game(ui);

       game.runGame();

       assertTrue(ui.askForMoveWasCalled());
   }
}
