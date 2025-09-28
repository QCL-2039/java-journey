package OOP.Problem16;

public class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        System.out.println("Area of the circle is: " + (Math.PI * radius * radius));

    }

    void calculatePerimeter() {
        System.out.println("Perimeter of the circle: " + (2 * Math.PI * radius));

    }

}
