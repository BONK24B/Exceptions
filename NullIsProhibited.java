package HW1;

import java.util.Scanner;

public class NullIsProhibited {
    // Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)){
            String input = scan.nextLine();

            if (input.isEmpty()){
                throw new EmptyLineException("Empty line is not allowed");
            }

            System.out.println(input);
        }

        catch (EmptyLineException e){
            System.out.println(e.getMessage());
        }
    }
}

class EmptyLineException extends Exception {
    public EmptyLineException(String message){
        super(message);
    }
}
