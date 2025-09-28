package OOP.Problem4;

public class Circle {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea() {
        return (3.1416 * radius);
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(5);

        System.out.println(
                "Radius " + c.getRadius() + " and area of this circle is : " + c.calculateArea() + " unit square.");
    }

}
