package cars;

public class GarageTest {

    public static void main(String[] args) {
        Garage garage = new Garage();

        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new F150();
        vehicles[0].setName("F150 Raptor");
        vehicles[1] = new Motorcycle();
        vehicles[1].setName("Ducati");
        vehicles[2] = new Car();
        vehicles[2].setName("Supra");
        vehicles[3] = new Car();
        vehicles[3].setName("Civic");

        garage.setVehicles(vehicles);

        garage.alarmCascade();

        vehicles[1] = new Car();
        vehicles[1].setName("Datsun");

        garage.alarmCascade();
    }
}
