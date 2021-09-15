public class ArrayMiniExercise {
    public static void main(String[] args) {
        double[] numbers = {1, 2, 3, 4, 5};

        double newNum = 0;
        for (double number : numbers) {
            newNum = newNum + number;
            System.out.println(newNum);
        }
    }
}
