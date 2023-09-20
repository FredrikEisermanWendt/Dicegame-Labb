package com.Fredrik.DiceGame;

import java.util.ArrayList;

public class GameControler {
    private CustomScanner input = new CustomScanner();
    private ArrayList<Player> playerList = new ArrayList();
    private int highscore;
    private Rules rules;


    public GameControler() {
        //printWelcomeList();
        //addPlayers();
        //setHighscore();
        //playGame();

    }

    private void printWelcomeList() {
        System.out.println("Welcome to THE GAME");

    }

//todo gör private
    public void addPlayers() {
        int noOfPlayers = input.inputInt("How many players: ");
        int noOfDice = input.inputInt("How manny dice? ");

        for (int i = 1; i <= noOfPlayers; i++) {
            String name = input.inputString("Give me the name of player no " + i + ": ");
            playerList.add(new Player(name, i, noOfDice));
        }

    }


    //todo set private
    public void setHighscore() {
        int i = playerList.get(0).getDiceAmount();
        System.out.println("Please set a highscore \nNote that recomended highscore is " + calcHighscore(i));
        highscore = input.inputInt("Highscore:");

    }

    private int calcHighscore(int diceAmount) {
        return (diceAmount * 6) * 10;
    }


    private void playGame() {

        //checkForWinners(); int

    }

    public int getHighscore() {
        return highscore;
    }
}
