package com.Fredrik.DiceGame;
import com.Fredrik.DiceGame.CustomScanner;

import java.util.ArrayList;
import java.util.Scanner;


public class CustomScanner {

    // TODO: 2023-09-18
    //ArrayList<InputStream>  streamList = new ArrayList<InputStream>();

    private Scanner input;

    public CustomScanner(){
        input = new Scanner(System.in);

    }

    // TODO: 2023-09-19 testa do while för hantering av fel input av datatyp


    // TODO: 2023-09-18  
    public int inputInt(String header) {
        System.out.println(header);
        return 1;
    }

    // TODO: 2023-09-18  
    public String inputString(String header) {
        System.out.println(header);
        String string = input.nextLine();
        string = formatFixer(string);
        return string;
    }

    private String formatFixer(String input){

        String string = input.toLowerCase();
        String capital = string.substring(0,1).toUpperCase();
        string = capital + string.substring(1,string.length());


        return string;
    }


}
