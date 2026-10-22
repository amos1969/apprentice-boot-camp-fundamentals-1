package vehicles;

public class Scooter extends Vehicle{
    public Scooter(double price) {
        super(price);
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 0.9;
    }
}
