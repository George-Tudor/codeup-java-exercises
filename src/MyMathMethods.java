import java.util.Scanner;

public class MyMathMethods {
    public static int multiply(int x, int y) {
        System.out.println("The product of " + x + " multiplied by " + y + " is " + (x * y));
        return x * y;
    }

    public static double multiply(double x, double y) {
        System.out.println("The product of " + x + " multiplied by " + y + " is " + (x * y));
        return x * y;
    }

    public static int getInts() {
        System.out.println("Please enter two integers: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        return multiply(x, y);
    }

}
