package com.Fredrik.DiceGame;

import com.Fredrik.DiceGame.CustomScanner;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class CustomScanner {


    private Scanner input;

    public CustomScanner() {
        input = new Scanner(System.in);
    }


    public int inputPositiveInt(String header) {
        int result = 0;
        while (result < 1) {
            System.out.println(header);
            result = intChecker();
        }
        input.nextLine();
        return result;
    }

    private int intChecker() {
        if (input.hasNextInt()) {
            int i = input.nextInt();
            return i;
        } else {
            System.out.println("Error: wrong datatype");
            input.nextLine();
            return -100;
        }
    }

    public String getRealString(String header){
        String string;
        do{
            string = inputString(header);
        }while (string == null);
        return string;
    }

    public void inputReturn(String header){
        System.out.println(header);
        input.nextLine();
    }



    public String inputString(String header){
        System.out.println(header);
        if (input.hasNextInt()){
            return null;
        }
        String string = input.nextLine();
        if (string.isEmpty()){
            return null;
        }
        string = formatFixer(string);
        return string;
    }


    private String formatFixer(String input) {

        String string = input.toLowerCase();
        String capital = string.substring(0, 1).toUpperCase();
        string = capital + string.substring(1);


        return string;
    }


}
