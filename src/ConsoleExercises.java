import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately " + pi);

//        System.out.println("Enter an integer: ");
//        int nextInt = scanner.nextInt();
//        System.out.printf("The integer is %s!", nextInt);

//        System.out.println("Enter 3 words: ");
//        String firstWord = scanner.nextLine();
//        String secondWord = scanner.nextLine();
//        String thirdWord = scanner.nextLine();
//        System.out.printf("Your first word is %s%n", firstWord);
//        System.out.printf("Your second word is %s%n", secondWord);
//        System.out.printf("Your third word is %s%n", thirdWord);

//        System.out.println("Enter a sentence: ");
//        String newString = scanner.nextLine();
//        System.out.printf("Your sentence was: %s%n", newString);

        System.out.println("Enter the dimensions of your Codeup classroom (width and length): ");
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt((scanner.nextLine()));
        int area = width * length;
        int perimeter = (2 * width) + (2 * length);
        System.out.printf("The area of your classroom is %s, and the perimeter is %s%n", area, perimeter);
    }
}
