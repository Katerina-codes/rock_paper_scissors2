package test.game;

import main.game.Rules;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RulesTest {

   @Test
   public void scoresADraw() {
      Rules rules = new Rules();

      assertEquals("draw", rules.scoreGame("rock", "rock"));
   }

}
