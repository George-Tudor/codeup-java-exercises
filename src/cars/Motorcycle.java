package cars;

public class Motorcycle extends Vehicle{

    public void makeNoise() {
        System.out.println("VVVvvvvvvvvrrrrrrroooooooooooooooommmmmmmmmmmmmm!!!!!!!!!!!");
        super.makeNoise();
        System.out.println("Pop screeeeeeech clunk clunck");
    }

    public Motorcycle() {

    }

    public Motorcycle(String name) {
        super(name);
    }

}
