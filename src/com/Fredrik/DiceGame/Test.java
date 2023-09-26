package com.Fredrik.DiceGame;

import java.util.ArrayList;

public class Test {

        public static int i;
        public static ArrayList<Dice> diceList = new ArrayList<>();
        public static CustomScanner scan = new CustomScanner();
        public static GameControler gc = new GameControler();
        public static Player p1 = new Player("Kalle", 1, 3);
        public static Player p2 = new Player("Minna", 2, 3);


    public static void main(String[] args) {





        //test player to string and print dice
        /*
        Player p1 = new Player("Kalle Jansson", 1, 3);
        System.out.println("");
        System.out.println(p1);
        p1.printDice();

         */

        //Test scanner inputInt()
        /*
        i = scan.inputInt("Ge mig en int");
        System.out.println(i);

         */



        //test set highscore in gameControler
        /*
        gc.addPlayers();
        gc.setHighscore();
        }

         */
/*
        //test of jackpot in Rules
        fillDiceList(3);
        for (Dice d : diceList){
            d.setNumber(3);
        }
        Rules rules = new Rules();
        int twentySeven = rules.scoreDice(diceList);
        System.out.println(twentySeven);

        //test of scoreice getscorefromdice
        fillDiceList(3);
        for (Dice d : diceList){
            System.out.println(d.toString());
        }
        rules = new Rules();
        int result = rules.scoreDice(diceList);
        System.out.println(result);


 */


        int i = scan.inputInt("hejsan");
        System.out.println(i);



    }
    public static void fillDiceList(int diceAmount){
        diceList.clear();
        for (int i = 0; i < diceAmount; i++){
            diceList.add(new Dice());
        }

    }

}
