package Test;

import com.Fredrik.DiceGame.Player;
import com.Fredrik.DiceGame.Dice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    private Player player = new Player("Kalle", 1, 3);

    @Test
    public void testPlayerNameIsKalle(){
        assertEquals("Kalle", player.getName());
    }

    @Test
    public void testPlayerNumberIs1(){
        assertEquals(1, player.getPlayerNumber());
    }

    @Test
    public void testPlayerDiceAmount(){
        int counter = 0;
        for (Dice d : player.diceList){
            counter ++;
        }
        assertEquals(3, counter);
    }



}