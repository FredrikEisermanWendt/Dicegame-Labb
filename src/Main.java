import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        int i = inputt();
        System.out.println(i);







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
        int num = 0;


        while(true) {
            try {
                System.out.println("HAej");
                num = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Detta är inte en int, det ser jag!");
            }
            System.out.println("hej");

        }
        return num;
    }



}
