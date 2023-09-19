package com.Fredrik.DiceGame;

import java.util.ArrayList;

public class GameControler {
    CustomScanner input = new CustomScanner();
    ArrayList <Player> playerList = new ArrayList();

    public GameControler(){
        printWelcomeList();
        addPlayers();
        startGame();

    }

    private void startGame() {

    }


    private void addPlayers() {
        int noOfPlayers = input.inputInt("How many players");
        int noOfDice = input.inputInt("how many dice? ");

        for(int i = 1; i <= noOfPlayers; i++){
            String name = input.inputString("Give me the name of the player: ");
            playerList.add(new Player(name, i, noOfDice));
        }

    }





    private void printWelcomeList() {
        System.out.println("Welcome to THE GAME");

    }


}
