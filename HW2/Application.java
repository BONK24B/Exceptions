package HW2;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Person pers = new Person();

        setPerson(pers);
        writeFile(pers);
        System.out.println(pers.toString());
    }

    public static void setPerson(Person person){
        try (Scanner scan = new Scanner(System.in)){
            System.out.print("Enter your second name: ");
            person.setSecondName(scan.nextLine());
            System.out.print("Enter your first name: ");
            person.setFirstName(scan.nextLine());
            System.out.print("Enter your third name: ");
            person.setThirdName(scan.nextLine());
            System.out.print("Enter your birth date (dd.mm.yyyy): ");
            person.setBirthDate(scan.nextLine());
            System.out.print("Enter your phone number: +79");
            person.setPhoneNumber(scan.nextInt());
            scan.nextLine();
            System.out.print("Enter your sex (m/f): ");
            String help = scan.nextLine();
            person.setSex(help.charAt(0));

            List<Object> args = List.of(person.getSecondName(), person.getFirstName(), person.getThirdName(),
                                        person.getBirthDate(), person.getPhoneNumber(), person.getSex());

            if (args.contains("null") || args.contains('n') || args.contains(0)) {
                System.out.println("Not enough information, please try again");
                setPerson(new Person());
            }
        } catch (InputMismatchException e) {
            System.out.println("Wrong input value");
        }
    }

    public static void writeFile(Person person){
        String fileName = person.getSecondName() + ".txt";

        try (FileWriter writer = new FileWriter(fileName, true)) {

            writer.write(person.toString());
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
