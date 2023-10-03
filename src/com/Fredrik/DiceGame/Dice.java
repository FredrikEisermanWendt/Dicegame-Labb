package com.Fredrik.DiceGame;

import java.util.Random;

public class Dice {

    private int number;
    private Random rand = new Random();

    public Dice() {
        rollDie();
    }

    //    konstruktor för testning
    public Dice(int number) {
        this.number = number;
    }

    public void rollDie() {
        number = rand.nextInt(0, 6) + 1;
    }

    public int getNumber() {
        return number;
    }


    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "" + number;
    }
}
