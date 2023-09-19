package com.Fredrik.DiceGame;

import java.util.ArrayList;

public class Player {

    private ArrayList<Dice> diceList = new ArrayList<>();
    private String name;
    private int playerNumber;
    private int score;

    public Player(String name, int number, int noOfDice){

        this.name= name;
        this.playerNumber = number;
        giveDice(noOfDice);
    }

    private void giveDice(int noOfDice){
        for (int i = 0; i < noOfDice; i++){
            diceList.add(new Dice());
        }
    }



}
