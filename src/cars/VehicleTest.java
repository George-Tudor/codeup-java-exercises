package cars;

import java.lang.module.ModuleReader;

public class VehicleTest {

    public static void main(String[] args) {
        Vehicle supra = new Vehicle();
        supra.setName("Supra");
        System.out.println("The " + supra.getName() + " goes: ");
        supra.makeNoise();

        Vehicle F150 = new F150();
        F150.setName("F150");
        System.out.println("The Ford F150 goes: ");
        F150.makeNoise();


        Motorcycle indian = new Motorcycle();
        indian.setName("Indian");
        System.out.println("The Indian motorcycles goes ");
        indian.makeNoise();

        Motorcycle hayabusa = new Motorcycle();
        hayabusa.setName("Hayabusa");
        System.out.println("The Hayabusa goes ");
        hayabusa.makeNoise();

        Car rx7 = new Car("Mazda Rx-7");

    }
}
