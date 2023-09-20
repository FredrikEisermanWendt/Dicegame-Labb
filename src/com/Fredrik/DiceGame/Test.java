package com.Fredrik.DiceGame;

public class Test {

    public static void main(String[] args) {

        int i;
        CustomScanner scan = new CustomScanner();
        GameControler gc = new GameControler();
        Player p1 = new Player("Kalle", 1, 3);
        Player p2 = new Player("Minna", 2, 3);

        //test player to string and print dice
        /*
        Player p1 = new Player("Kalle Jansson", 1, 3);
        System.out.println("");
        System.out.println(p1);
        p1.printDice();

         */

        //Test scanner inputInt()

        i = scan.inputInt("Ge mig en int");
        System.out.println(i);



        //test set highscore in gameControler
        /*
        gc.addPlayers();
        gc.setHighscore();





        }

         */







    }
}
