package cars;

public class F150 extends Vehicle{
    public void makeNoise() {
        System.out.println("Womp womp");
    }

    public F150() {

    }

    public F150(String name) {
        super(name);
    }
}
