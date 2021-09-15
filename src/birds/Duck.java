package birds;

public class Duck extends Bird{
// let's override the superclass makeNoise() method

    public void makeNoise() {
        super.makeNoise();
        System.out.println("Quack Quack");
    }

    public void setName(String duckName) {
        super.setName(duckName);

    }

    public Duck() {

    }

    public Duck(String name) {
        super(name);
//        this.setName(name);
        System.out.println("A new duck has been created.");
    }
}
