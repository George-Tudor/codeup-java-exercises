import java.util.Scanner;

public class MethodsMiniExercises {


    // TODO: break the following code apart into a few methods
    public static String getStringInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an input.");
        return sc.nextLine();
        }

    public static int getUserInt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer.");
        return sc.nextInt(); // assume the user will enter a valid integer
        }

    public static void outputInfo() {
        String stringInput = getStringInput();
        int intInput = getUserInt();
        if (stringInput.length() == intInput) {
            System.out.println("That matches the length of the input!");
        } else {
            System.out.println("That doesn't match the length of the input!");
        }
    }

    public static void main(String[] args) {
        outputInfo();

    }

}