package util;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println("Enter a string: ");
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Please enter y, yes, Y, or Yes: ");
        String userInput = scanner.nextLine().toLowerCase().trim();
        return userInput.equals("y") || userInput.equals("yes");
    }

    public int getInt(int min, int max) {
        int userInput;
        do {
            System.out.println("Enter a number between " + min + " and " + max);
            userInput = scanner.nextInt();
        } while (userInput < min || userInput > max);
        return userInput;

    }

    public int getInt() {
        System.out.println("Enter an integer: ");
        return scanner.nextInt();
    }

public double getDouble(double min, double max) {
        int userInput;
        do {
            System.out.println("Enter a number between " + min + " and " + max);
            userInput = scanner.nextInt();
        } while (userInput < min || userInput > max);
        return userInput;

    }

    public double getDouble() {
        System.out.println("Enter a double: ");
        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("User entered string " + input.getString());

        System.out.println(input.getInt(1, 10));
        System.out.println(input.getDouble(1, 10));
    }


}
