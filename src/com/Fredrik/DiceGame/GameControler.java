package com.Fredrik.DiceGame;
import java.util.ArrayList;
import java.util.Comparator;

public class GameControler {
    private CustomScanner input = new CustomScanner();
    private ArrayList<Player> playerList = new ArrayList();
    private ArrayList<Player> winnerList = new ArrayList<>();
    private int highscore;
    private Rules rules = new Rules();


    public GameControler() {
        printWelcomeList();
        addPlayers();
        setHighscore();
        playGame(playerList);
        listWinners();
        endGame();
        printEndingMessage();


    }

    private void printEndingMessage() {
        System.out.println("Thank you for playing!\nDo play again!");
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
        System.out.println("Please set a highscore \nNote that recommended highscore is " + calcHighscore(i));
        highscore = input.inputInt("Highscore:");

    }

    public void setHighscore(int highscore) {
        this.highscore = highscore;
    }

    private int calcHighscore(int diceAmount) {
        return (diceAmount * 6) * 10;
    }


    private void playGame(ArrayList<Player> playerList) {
        do {
            for (Player p : playerList) {
                p.  playRound();
            }
        } while (checkForWinners(playerList) < 1);
    }

    private int checkForWinners(ArrayList<Player> playerList) {
        int counter = 0;
        for (Player p : playerList) {
            if (p.getScore() >= highscore) {
                counter++;
            }
        }
        return counter;
    }

    private void endGame() {
        if (winnerList.size() == 1) {
            oneWinnerEnding();
            return;
        }
        draw();
    }

    private void oneWinnerEnding() {
        System.out.println("We have a winner!");
        System.out.println(winnerList.get(0) + " You deserve an icecream!");
    }

    //todo private
    public void draw() {
        int choice = input.inputInt("We have a DRAW!\nHow will You end it?\nEnter:\n1: For the \"Diplomatic Route\"\n2: For \"WAR\"");

        switch (choice) {
            case 1:
                System.out.println("Thank you for being smart, nothing good comes from war");
                diplomaticEnding();
                break;
            case 2:
                warEnding();
                break;
            default:
                System.out.println("Error: No such option!");
                draw();
        }
    }

    private void warEnding() {
        System.out.println("You have chosen war! I hope you are ready for the consequences!");
        do {
            playGame(winnerList);
        } while (noOfWinners(winnerList) != 1);
        sortListAfterHighestScore(winnerList);
        System.out.println("We have a WINNER! The most worthy winner in  a long time!");
        System.out.println("The winner is " + winnerList.get(0));
    }

    private int noOfWinners(ArrayList<Player> playerList) {
        int temp = 0;
        int highestScore = gethighestScoreFrom(winnerList);
        for (Player p : winnerList) {
            if (p.getScore() == highestScore) {
                temp++;
            }
        }
        return temp;
    }


    private void diplomaticEnding() {
        System.out.println("Our diplomatic heroes are: ");
        for (Player p : winnerList) {
            System.out.println(p);
        }
    }

    private void listWinners() {
        int highestScore = gethighestScoreFrom(playerList);
        for (Player p : playerList) {
            if (p.getScore() == highestScore) {
                winnerList.add(p);
            }
        }

    }

    private int gethighestScoreFrom(ArrayList<Player> playerList) {
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

    private void sortListAfterHighestScore(ArrayList<Player> playerList) {
        winnerList.sort(new Comparator<Player>() {
            @Override
            public int compare(Player p1, Player p2) {
                return p2.getScore() - p1.getScore();
            }
        });

    }


}


