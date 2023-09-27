package com.Fredrik.DiceGame.Tests;

import com.Fredrik.DiceGame.Dice;
import com.Fredrik.DiceGame.Rules;

import java.util.ArrayList;

public class RulesTest {

    public static Rules rules = new Rules();
    public static ArrayList<Dice> diceList = new ArrayList<>();

    public static void main(String[] args) {


        // test of isAllSame()
        // TODO: 2023-09-26 make isAllSame public for testing

        rules.fillDListRandomDiceTesting();
        boolean fals = rules.isAllSame();
        System.out.println(fals);

        rules.clearDiceList();

        rules.fillDListAllSameTesting();
        boolean tru = rules.isAllSame();
        System.out.println(tru);




        //test of scoreDice()
        fillDiceList(3);
        for (Dice d : diceList) {
            System.out.println(d.toString());
        }

        rules = new Rules();

        int result = rules.scoreDice(diceList);
        System.out.println(result);


        //test of jackpot in Rules
        fillDiceList(3);
        for (Dice d : diceList) {
            d.setNumber(3);
        }

        Rules rules = new Rules();
        int twentySeven = rules.scoreDice(diceList);
        System.out.println(twentySeven);


    }


    public static void fillDiceList(int diceAmount) {
        diceList.clear();
        for (int i = 0; i < diceAmount; i++) {
            diceList.add(new Dice());
        }

    }


}
