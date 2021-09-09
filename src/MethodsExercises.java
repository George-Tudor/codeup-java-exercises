import java.util.Scanner;


public class MethodsExercises {
    public static Scanner scanner = new Scanner(System.in);

    public static int addInts(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtractInts(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplyInts(int num1, int num2) {
        return num1 * num2;
    }

    public static int divideInts(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulo(int num1, int num2) {
        return num1 % num2;
    }

    public static int checkRange(int min, int max) {

        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max) {
            System.out.println("Your number is " + userInput);
            return userInput;

        }   System.out.println("The number must be between " + min + " and " + max + ", try again.");
            return checkRange(min, max);

        }


        public static void main (String[] args){
            System.out.println("The output for the addition method is " + addInts(27, 81));
            System.out.println("The output for the subtraction method is " + subtractInts(9, 5));
            System.out.println("The output for the multiplication method is " + multiplyInts(12, 16));
            System.out.println("The output for the division method is " + divideInts(81, 9));
            System.out.println("The output for the modulus method is " + modulo(81, 8));
            System.out.println("Enter a number between 1 and 10: ");
            int userInput = checkRange(1, 10);

        }
    }

