package stringtransformer;

public class UpperCaseStringTransformer extends StringTransformer {

    public void stringGet(String str) {
        str = super.str;
    }

    @Override
    public String transform(String str) {
        return str.toUpperCase();
    }
}
