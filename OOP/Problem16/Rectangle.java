package OOP.Problem16;

public class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void calculateArea() {
        System.out.println("Area of this Rectangle: " + (length * width));

    }

    void calculatePerimeter() {
        System.out.println("Perimeter of the Recatagnle: " + 2 * (length + width));

    }
}
