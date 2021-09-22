public class ExceptionsMiniExercise2Test {

    public static void main(String[] args) {
        ExceptionsMiniExercise2 el2 = new ExceptionsMiniExercise2();
        el2.subListMaker("Let's go ahead and work with this sentence, shall we?");

        try {
            el2.echoWord();
        } catch (CusswordException cx){
            System.out.println(cx.getMessage());
        }
    }
}
