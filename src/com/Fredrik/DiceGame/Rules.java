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
    * alla tärningar ettor ger extra poäng??
    *
    * man får välja anta tärningar och antal poäng att spela till
    * om det är orimligt få poäng bör spelaren välja fler
    * när spelet statras får man fråga om hur många spelare det är,
    * varje spelare får skriva namn och man tilldelas ett nummer
    * */

    public int scoreDice (ArrayList<Dice> diceList) {
        this.diceList = diceList;
        int result = 0;
        if(isAllSame()){
            return jackpot();
        }else {
            result = getPointsFromDice();
            return result;
        }
    }

    private int jackpot() {
        return (diceList.get(0).getNumber() * diceList.size()) + (diceList.size() * 6);
    }

    private int getPointsFromDice(){
        int result = 0;
        for (Dice d : diceList) {
            result += d.getNumber();
        }
        return result;
    }

    private boolean isAllSame() {
        int counter = 1;
        for (int i = 0; i < diceList.size() -1; i++){
            if (diceList.get(i).getNumber() != diceList.get(i+1).getNumber()){
                counter --;
            }
        }
        if(counter == 1){
            return true;
        }else{
            return false;
        }
    }


}
