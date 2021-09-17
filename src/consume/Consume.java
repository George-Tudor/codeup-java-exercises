package consume;

public interface Consume {
    void consume();
    void checkIfExpired();
    void throwAway();
}
