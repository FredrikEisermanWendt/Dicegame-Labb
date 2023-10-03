package com.Fredrik.DiceGame;

import java.util.ArrayList;

public class Player {

    private ArrayList<Dice> diceList = new ArrayList<>();
    private String name;
    private int playerNumber;
    private int score = 0;
    private Rules rules = new Rules();
    private CustomScanner scan = new CustomScanner();

    public Player(String name, int number, int noOfDice) {

        this.name = name;
        this.playerNumber = number;
        giveDice(noOfDice);
    }

    private void giveDice(int noOfDice) {
        for (int i = 0; i < noOfDice; i++) {
            diceList.add(new Dice());
        }
    }

    public void printDiceList() {
        for (Dice d : diceList) {
            System.out.println(d);
        }
    }

    public int getDiceAmount() {
        return diceList.size();

    }

    public void playRound() {
        scan.inputReturn(name + " it's your turn!\nYou have " + score + " points\nPress enter to roll");
        rollDice();
        printDiceList();
        score += rules.scoreDice(diceList);
        System.out.printf("%s you have %d points %n", name, score);
        System.out.println("");

    }

    @Override
    public String toString() {
        return "Player no " + playerNumber + ": " + name;
    }


    public int getScore() {
        return score;
    }


    private void rollDice() {
        for (Dice d : diceList) {
            d.rollDie();
        }
    }

    public void setScore(int score) {
        this.score = score;
    }
}
