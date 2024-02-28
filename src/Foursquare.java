public class Foursquare extends Shape{
    private double side;

    public Foursquare(double side) {
        this.side = side;
    }

    public double getPerimeter() {
        return 4 * side;
    }
}
