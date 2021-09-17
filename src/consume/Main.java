package consume;

public class Main {

    public static void main(String[] args) {
        Carrot carrot = new Carrot();
        carrot.checkIfExpired();
        carrot.consume();
        carrot.throwAway();
    }
}
