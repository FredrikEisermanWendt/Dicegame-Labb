package com.Fredrik.DiceGame;

import java.util.ArrayList;

public class GameControler {
    private CustomScanner input = new CustomScanner();
    private ArrayList<Player> playerList = new ArrayList();
    private ArrayList<Player> winnerList = new ArrayList<>();
    private int highscore;
    private Rules rules;


    public GameControler() {
        //printWelcomeList();
        //addPlayers();
        //setHighscore();
        //playGame();
        listWinners();
        endGame();


    }

    private void printWelcomeList() {
        System.out.println("Welcome to THE GAME");

    }

    //todo gör private
    public void addPlayers() {
        int noOfPlayers = input.inputInt("How many players: ");
        int noOfDice = input.inputInt("How many dice? ");

        for (int i = 1; i <= noOfPlayers; i++) {
            String name = input.inputString("Write the name of player no " + i + ": ");
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
        do {
            for (Player p : playerList) {
                p.playRound();
            }
        } while (checkForWinners() < 1);
    }

    private int checkForWinners() {
        int counter = 0;
        for (Player p : playerList) {
            if (p.getScore() >= highscore) {
                counter++;
            }
        }
        return counter;
    }

    private void endGame() {
        if (winnerList.size() == 1){
            //printOneWinnerMessage
            return;
        }
        draw();
    }

    //todo private
    public void draw(){
        int choice = input.inputInt("We have a DRAW!\nHow will You end it?\nEnter:\n1: For the \"Diplomatic Route\"\n2: For \"WAR\"");

        switch (choice){
            case 1:
                diplomaticEnding();
                break;
            case 2:
                oneDiceGame(1);
                break;
            default:
                System.out.println("No such option");
                draw();
        }
    }

    private void listWinners() {
        int higestScore = getHighscore();
        for (Player p : playerList) {
            if (p.getScore() == higestScore) {
                winnerList.add(p);
            }
        }

    }

    private int highestScore() {
        int highscore = playerList.get(0).getScore();
        for (Player p : playerList) {
            if (p.getScore() > highscore) {
                highscore = p.getScore();
            }
        }
        return highscore;
    }

    public int getHighscore() {
        return highscore;
    }



}


