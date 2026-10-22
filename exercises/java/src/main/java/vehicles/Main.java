package vehicles;

public class Main {
    static void main() {
        Vehicle genericVehicle = new Vehicle(10.0);
        System.out.println("General vehicle price is: " + genericVehicle.getPrice());

        Motorbike yamaha = new Motorbike(500.0);
        System.out.println("Motorbike price is: " + yamaha.getPrice());

        Car porsche = new Car(10000.0, 3);
        System.out.println("Porsche price is: " + porsche.getPrice());
        System.out.println("It has " + porsche.getNumberOfDoors());
    }
}
