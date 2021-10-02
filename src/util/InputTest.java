package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("User entered string " + input.getString());
        System.out.println("Enter a choice between 1 and 10");
        input.getInt(1, 10);
        System.out.println(input.getDouble(1, 10));
    }
}
