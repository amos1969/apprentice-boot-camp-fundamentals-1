package vehicles;

public class Main {
    static void main() {
        Vehicle[] vehicles = {new Car(), new Car(), new Car(), new Boat(), new Plane()};
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getMovementMethod());
        }
    }
}
