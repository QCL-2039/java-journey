package OOP.Problem3;

public class Rectangle {

    public double height;
    public double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public void calculateArea() {
        System.out.println("Area of this rectangle: " + (height * width) + " unit square.");
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        r.calculateArea();
    }

}
