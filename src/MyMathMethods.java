import java.lang.reflect.Array;
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

    public static int quotient(int x, int y) {
        System.out.println("The quotient of " + x + " divided by " + y + " is " + ( x / y ) );
        return x / y;
    }

    public static double quotient(double x, double y) {
        System.out.println("The quotient of " + x + " divided by " + y + " is " + ( x / y ) );
        return x / y;
    }

    public static int arraySum(int[] numbers) {
        int sum = 0;
        for( int i = 0; i < numbers.length; i++ ) {
            sum += numbers[i];
        }
        //System.out.println(sum);
        return sum;
    }

    public static void getInts() {
        System.out.println("Please enter two numbers: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println(multiply(x, y));
        System.out.println(quotient(x, y));

    }

}
