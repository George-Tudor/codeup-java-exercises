package birds;

public class Bird {
    //what kind of bird is it?
    private String name;

    public String getName()
    {

        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void makeNoise()
    {
        System.out.println("Tweet tweet");
    }

    public void move()
    {
        System.out.println("Flap flap");
    }

    public Bird() {

    }

    public Bird(String name) {
        System.out.println("A new bird has been created.");
        this.name = name;
    }
}

















/*Create a Vehicle class with two properties: a name instance variable and a makeNoise() method. The instance variable should be private and have getters and setters (in IntelliJ try cmd-N). The makeNoise method should just sout out a typical vehicle noise. Then create a more specific vehicle subclass, such as Motorcycle, Car, Truck, Tractor, whatever. Make the specific vehicle class extend the Vehicle class. Otherwise, keep it empty. Create a test class, perhaps calling it VehicleTest Instantiate the specific vehicle, assign a value to the name property and run the methods on the specific vehicle. Notice the inherited method works and the inherited name property is assignable on the subclass.*/
