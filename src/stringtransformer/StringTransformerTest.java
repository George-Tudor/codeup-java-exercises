package stringtransformer;

public class StringTransformerTest {

    public static void main(String[] args) {
        UpperCaseStringTransformer upper = new UpperCaseStringTransformer();
        System.out.println(upper.transform("This is a test"));
        ReverseStringTransformer reverse = new ReverseStringTransformer();
        System.out.println(reverse.transform("This is also a test"));
    }
}
