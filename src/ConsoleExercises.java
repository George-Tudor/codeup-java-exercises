import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately " + pi);

//        System.out.println("Enter an integer: ");
//        int userInput = scanner.nextInt();
//        System.out.printf("The integer is %s!", userInput);

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

        System.out.println("Enter the dimensions of your Codeup classroom (width, length, and height): ");
        float width = Float.parseFloat(scanner.nextLine());
        float length = Float.parseFloat(scanner.nextLine());
        float height = Float.parseFloat(scanner.nextLine());
        float area = width * length;
        float perimeter = (2 * width) + (2 * length);
        float volume = width * length * height;
        System.out.printf("The area of your classroom is %s, the perimeter is %s, and the volume is %s.%n", area, perimeter, volume);
    }
}
