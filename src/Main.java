public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(5, 3, 2);
        Rectangle rectangle = new Rectangle(4, 7);
        Circle circle = new Circle(3);
        Foursquare square = new Foursquare(6);

        System.out.println("Периметр треугольника: " + triangle.getPerimeter());
        System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter());
        System.out.println("Длина окружности: " + circle.getPerimeter());
        System.out.println("Периметр квадрата: " + square.getPerimeter());

    }
}