package Test;

import com.Fredrik.DiceGame.Dice;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    Dice dice = new Dice();

    @Test
    public void testDiceInRange(){
        for (int i = 0; i < 1000; i++){
            dice.rollDie();
            int result = dice.getNumber();
            assertTrue(result >=1 && result <= 6, "Dice roll out of range: " + result );
        }

    }





}