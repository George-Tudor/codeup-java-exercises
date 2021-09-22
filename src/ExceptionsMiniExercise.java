public class ExceptionsMiniExercise {

    public static String testString = "chalupas";

    public static void main(String[] args) {
        try {
            System.out.println(testString.length());
            System.out.println(testString.substring(4));
            System.out.println(testString.substring(9));
        } catch (IndexOutOfBoundsException iob) {
            System.out.println("Whoa dude out of bounds: " + iob);
            System.out.println(iob.getMessage());
            iob.printStackTrace();
        }
    }
}
