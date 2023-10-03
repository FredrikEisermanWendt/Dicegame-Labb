package com.Fredrik.DiceGame;

import java.util.ArrayList;
import java.util.Comparator;

public class Test {

    public static int i;
    public static ArrayList<Dice> diceList = new ArrayList<>();
    public static ArrayList<Player> playerList = new ArrayList<>();
    public static CustomScanner scan = new CustomScanner();
    public static Player p1 = new Player("Kalle", 1, 3);
    public static Player p2 = new Player("Minna", 2, 3);
    public static Rules rules = new Rules();


    public static void main(String[] args) {
//
//
//        //test player to string and print dice
//
//        Player p1 = new Player("Kalle Jansson", 1, 3);
//        System.out.println("");
//        System.out.println(p1);
//        p1.printDice();
//
//
//
//        //Test scanner inputInt()
//
//        i = scan.inputInt("Ge mig en int");
//        System.out.println(i);




//        //test set highscore in gameControler
//
//        public static GameControler gc = new GameControler();
//
//        gc.addPlayers();
//        gc.setHighscore();
//        }
//
//

//
//        int noOfPlayers = scan.inputInt("How many players: ");
//        int noOfDice = scan.inputInt("How many dice? ");
//
//        for (int i = 1; i <= noOfPlayers; i++) {
//            String name = scan.inputString("Write the name of player no " + i + ": ");
//            playerList.add(new Player(name, i, noOfDice));
//        }
//
//        int i = 5;
//        for (Player p : playerList) {
//            p.setScore(i);
//            i++;
//            System.out.println(p);
//            System.out.println(p.getScore());
//        }
//
//        warEnding();
//
//        for (Player p : playerList) {
//            System.out.println(p);
//            System.out.println(p.getScore());
//        }
//
//
//    }
//
//    private static void warEnding() {
//        System.out.println("You have chosen war! I hope you are ready for the consequences!");
//        playerList.sort(new Comparator<Player>() {
//            @Override
//            public int compare(Player p1, Player p2) {
//                return p2.getScore() - p1.getScore();
//            }
//        });
//    }
//
//    public static void fillDiceList(int diceAmount) {
//        diceList.clear();
//        for (int i = 0; i < diceAmount; i++) {
//            diceList.add(new Dice());
//        }
//
    }

}
