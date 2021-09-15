package birds;

public class Penguin extends Bird{
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Honk Honk");
    }

    public void move() {
        System.out.println("Waddle waddle");
    }

    public Penguin() {
        super();
    }
}
