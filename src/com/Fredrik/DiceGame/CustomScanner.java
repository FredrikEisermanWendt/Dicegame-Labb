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


    public int inputInt(String header) {
        int result = -100;

        while (result == -100) {
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


    public String inputString(String header) {
        System.out.println(header);
        String string = input.nextLine();
        if (string.isEmpty() || string == null){
            return string;
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
