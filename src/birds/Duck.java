package birds;

public class Duck extends Bird{
// let's override the superclass makeNoise() method

    public void makeNoise() {
        super.makeNoise();
        System.out.println("Quack Quack");
    }
}
