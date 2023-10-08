package com.Fredrik.DiceGame;

import java.util.Random;

public class Dice {

    private int number;
    private Random rand = new Random();

    public Dice() {
        rollDie();
    }

    public void rollDie() {
        number = rand.nextInt(6) + 1;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "" + number;
    }


}
