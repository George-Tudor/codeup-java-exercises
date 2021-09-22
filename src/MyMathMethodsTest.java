public class MyMathMethodsTest {
    public static void main(String[] args) {
        MyMathMethods.multiply(5, 4);
        MyMathMethods.multiply(5.5, 6.5);

        MyMathMethods.quotient(50, 5);
        MyMathMethods.quotient(324.34, 12.7);

        MyMathMethods.getInts();

        int[] myArray = {3, 4, 5, 6, 7};
        System.out.println(MyMathMethods.arraySum(myArray));
    }

}
