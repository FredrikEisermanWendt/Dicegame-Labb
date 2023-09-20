import com.Fredrik.DiceGame.CustomScanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CustomScanner cscan = new CustomScanner();


    }

    public static int inputter(){

        Scanner input = new Scanner(System.in);

        System.out.println("HAej");

        while(!input.hasNextInt()){
            System.out.println("Wrong");
            input.nextInt();
        }

        int num = input.nextInt();
        return num;
    }

    public static int inputt(){
        Scanner input = new Scanner(System.in);
        int num = -1;
        int counter = 0;

            System.out.println("HAej");
            try {
                num = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Detta är inte en int, det ser jag!");
            }


        return num;


    }



}
