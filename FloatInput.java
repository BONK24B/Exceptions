package HW1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FloatInput {
    public static void main(String[] args) {
        input();
    }

    public static void input(){
        try {
            System.out.println("Enter a float value: ");
            prompt();
        }
        catch (InputMismatchException e){
            System.out.println("An exception occured, try again");
            input();
        }
    }
    
    public static void prompt(){
        Scanner scan = new Scanner(System.in);
        float prompt = scan.nextFloat();
        System.out.println(prompt);

        scan.close();
    }
}
