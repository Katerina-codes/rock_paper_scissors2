package test.game.Player;

import main.game.CommandLine.Ui;
import main.game.Language.GameFactory;
import main.game.Player.Computer;
import main.game.Player.Human;
import main.game.Player.Player;
import org.junit.Test;
import test.game.CommandLine.FakeCommandlineUi;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class GameFactoryTest {

    @Test
    public void getTwoHumanPlayers() {
        Ui ui = new FakeCommandlineUi();
        GameFactory gameFactory = new GameFactory(ui);

        List<Player> players = gameFactory.getPlayerTypes("1");

        assertTrue(players.get(0) instanceof Human);
        assertTrue(players.get(1) instanceof Human);
    }

    @Test
    public void getOneHumanPlayerAndOneComputerPlayer() {
        Ui ui = new FakeCommandlineUi();
        GameFactory gameFactory = new GameFactory(ui);

        List<Player> players = gameFactory.getPlayerTypes("2");

        assertTrue(players.get(0) instanceof Human);
        assertTrue(players.get(1) instanceof Computer);
    }
}
