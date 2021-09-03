import java.util.Scanner;

public class myIOExperiment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your name?");
//        String userInput = scanner.nextLine();
//        //System.out.println("Hello " + userInput);
//        System.out.printf("Hello %s!", userInput);
        //option 1: an extra nextline()
        //String ghostString = scanner.next();
        //option 2: concatenate a .next() and a .nextLine()
        System.out.println("Enter an integer: ");
        int userInput = scanner.nextInt();
        System.out.println("Enter a string: ");
        String firstString = scanner.nextLine();
        System.out.println("Enter anoother string: ");
        String secondString = scanner.nextLine();
        System.out.println("First sentence: " + firstString + "\n Second string " + secondString);
        //System.out.printf("You entered %d%n", userInput);

    }
}
