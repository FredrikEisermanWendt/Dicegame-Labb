package com.Fredrik.DiceGame;

import com.Fredrik.DiceGame.Dice;

import java.util.ArrayList;

public class Rules {
    ArrayList<Dice> diceList = new ArrayList<>();

    /*
     *
     * tärningarnas summa räknas ihop och först till ?? vinner
     * när någon når ?? spelas rundan klart så alla får lika många slag
     * om några slutar på samma summa ska man få två alternativ
     * det diplomatiska delad vinnare
     * det krigiska super sudden death tills någon vunnit
     * alla tärningar lika ger extra poäng
     *
     * man får välja anta tärningar och antal poäng att spela till
     * om det är orimligt få poäng bör spelaren välja fler
     * när spelet statras får man fråga om hur många spelare det är,
     * varje spelare får skriva namn och man tilldelas ett nummer
     * */

    // TODO: 2023-09-27 snygga till logiken
    public int scoreDice(ArrayList<Dice> diceList) {
        this.diceList = diceList;
        int result = 0;
        // check if only one die is used, so we dont get jackpot on all or crash the program.
        if (diceList.size() < 2) {
            result = getPointsFromDice();
            System.out.println("You got " + result + " points");
            return result;
        }
        if (isAllSame()) {
            System.out.println("YOU GOT A JACKPOT!!!");
            System.out.println("You got " + jackpot() + " points");
            return jackpot();
        } else {
            result = getPointsFromDice();
            System.out.println("You got " + result + " points");
            return result;
        }
    }

    private int jackpot() {
        return (getPointsFromDice() + (diceList.size() * 6));
    }

    private int getPointsFromDice() {
        int result = 0;
        for (Dice d : diceList) {
            result += d.getNumber();
        }
        return result;
    }


    // TODO: 2023-09-26 private
    public boolean isAllSame() {
        int counter = 1;
        for (int i = 0; i < diceList.size() - 1; i++) {
            if (diceList.get(i).getNumber() != diceList.get(i + 1).getNumber()) {
                counter--;
            }
        }
        if (counter == 1) {
            return true;
        } else {
            return false;
        }
    }


    // metoder för testning
    //todo ta bort eller gör private
    public void fillDListAllSameTesting() {
        for (int i = 0; i < 6; i++) {
            diceList.add(new Dice(5));
        }
    }

    public void fillDListRandomDiceTesting() {
        for (int i = 0; i < 6; i++) {
            diceList.add(new Dice());
        }
    }

    public void clearDiceList() {
        diceList.clear();
    }


}
