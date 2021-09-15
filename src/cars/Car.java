package cars;

public class Car extends Vehicle{


    public void makeNoise() {
        System.out.println("BEEEEEEEEEEEP BEEEEEEEEEEEEP");
    }

    public Car() {

    }

    public Car(String name) {
        super(name);
    }

    public void setName(String carName) {
        super.setName(carName);

    }
}
