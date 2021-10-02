package util;

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
            userInput = scanner.nextInt();
            if(userInput < min || userInput > max) {
                System.out.println("Your entry must be between " + min + " and " + max + ".");
            }
        } while (userInput < min || userInput > max);
        return userInput;
    }

    public int getInt() {
        return scanner.nextInt();
    }

public double getDouble(double min, double max) {
        double userInput;
        do {
            System.out.println("Enter a number between " + min + " and " + max);
            userInput = scanner.nextDouble();
        } while (userInput < min || userInput > max);
        return userInput;

    }

    public double getDouble() {
        System.out.println("Enter a double: ");
        return scanner.nextDouble();
    }



}
