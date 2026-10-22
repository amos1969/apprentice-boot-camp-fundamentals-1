package vehicles;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(double price, int doors) {
        super(price);
        this.numberOfDoors = doors;
    }

    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }
}
