package stringtransformer;

public class ReverseStringTransformer extends StringTransformer {

    public void stringGet(String str) {
        str = super.str;
    }

    @Override
    public String transform(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}
