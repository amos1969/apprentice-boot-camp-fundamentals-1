package cat;

public class Mat {
    double width;
    double length;
    String colour;

    public Mat(String colour, double length, double width) {
        this.colour = colour;
        this.length = length;
        this.width = width;
    }

    public Mat() {

    }

    @Override
    public String toString() {
        return "Mat - Colour: " + this.colour + " Width: " + this.width + " Length: " + this.length;
    }
}
