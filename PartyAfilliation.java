import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your party affiliation:");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");
        System.out.print("Enter your choice: ");
        String choice = scanner.next();
        choice = choice.toUpperCase();

        String symbol;
        if (choice.equals("D")) {
            symbol = "Donkey";
        } else if (choice.equals("R")) {
            symbol = "Elephant";
        } else if (choice.equals("I")) {
            symbol = "Person";
        } else {
            symbol = "Other";
        }

        System.out.println("You get a " + symbol + ".");

        scanner.close();
    }
}
