package cars;

public class Garage {

    private Vehicle[] vehicles;

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public void alarmCascade() {
        for(Vehicle vehicle : vehicles) {
            System.out.println(vehicle + "'s alarm is going off, and sounds like : ");
            vehicle.makeNoise();
        }

    }

    public Vehicle findVehicle(String name, Vehicle[] vehicles) {
        for(Vehicle vehicle: vehicles) {
            if (vehicle.getName().equalsIgnoreCase(name)){
                return vehicle;
            }
        }
        Vehicle notHere = new Vehicle();
        return notHere;
    }
}
