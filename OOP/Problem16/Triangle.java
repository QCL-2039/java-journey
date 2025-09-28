package OOP.Problem16;

public class Triangle extends Shape {
    double sideA;
    double sideB;
    double sideC;

    Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    void calculateArea() {
        double s = (sideA + sideB + sideC) / 2;
        double area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
        System.out.println("Area of Triangle: " + area);

    }

    void calculatePerimeter() {
        double perimeter = sideA + sideB + sideC;
        System.out.println("Perimeter of Triangle: " + perimeter);

    }

}
