package OOP.Problem8;

public class TrafficLight {
    private String colour;
    private int duration; // in seconds

    public TrafficLight(String colour, int duration) {
        this.colour = colour;
        this.duration = duration;
    }

    public void changeColour(String colour) {
        this.colour = colour;
        System.out.println("Colour changed to: " + colour);
    }

    public void checkColour() {
        if (colour.equalsIgnoreCase("Red")) {
            System.out.println("Traffic Light colour is Red. STOP!");
        } else if (colour.equalsIgnoreCase("Green")) {
            System.out.println("Traffic Light colour is Green. GO!");
        } else {
            System.out.println("Traffic Light colour is Yellow. WAIT!");
        }
    }

    public void start() {
        try {
            System.out.println("Current colour: " + colour + " for " + duration + " seconds.");
            Thread.sleep(duration * 1000);
            System.out.println(colour + " light ended.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TrafficLight red = new TrafficLight("Red", 5);
        TrafficLight green = new TrafficLight("Green", 3);
        TrafficLight yellow = new TrafficLight("Yellow", 2);

        red.checkColour();
        red.start();

        yellow.changeColour("Yellow");
        yellow.checkColour();
        yellow.start();

        green.checkColour();
        green.start();
    }
}
