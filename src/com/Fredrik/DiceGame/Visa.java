package com.Fredrik.DiceGame;

import java.util.Arrays;

public class Visa {
    private static final int ARRAY_ERROR_VALUE = -1;
    CustomScanner scanner = new CustomScanner();
    int[] dices = {3, 2, 3, 3, 1};

    public void printDice(){
        System.out.println(Arrays.toString(dices));
    }

    public void errorLoop(){
        int remDice = scanner.inputInt("välj Tärning");
        for (int i = 0; i < dices.length; i++){
            if (remDice == dices[i]) {
                dices[i] = ARRAY_ERROR_VALUE;
                return;
            }
        }

    }
}
