package OOP.Problem16;

public class Tester {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        Circle circle = new Circle(5);
        circle.calculateArea();
        circle.calculatePerimeter();
        Triangle triangle = new Triangle(3, 5, 6);
        triangle.calculateArea();
        triangle.calculatePerimeter();

    }

}
