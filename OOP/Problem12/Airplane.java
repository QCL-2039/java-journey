package OOP.Problem12;

import java.time.LocalDate;
import java.time.Period;

public class Airplane {
    public String flightNumber;
    public String destination;
    public LocalDate depatureDate;

    Airplane(String flightNumber, String destination, LocalDate depatureDate) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.depatureDate = depatureDate;
    }

    public void showDetails() {
        System.out.println(
                "Flight Number: " + flightNumber + " ,Destination: " + destination + " ,Depature: " + depatureDate);
    }

    public void flightStatus() {
        LocalDate today = LocalDate.now();
        Period period = Period.between(today, depatureDate);
        System.out.println(
                period.getYears() + " years," + period.getMonths() + " months," + period.getDays() + " days");
    }

    public void flightDelay(int days) {

        depatureDate = depatureDate.plusDays(days);
        System.out.println("New departure date: " + depatureDate);
        flightStatus();
    }

    public static void main(String[] args) {
        Airplane a = new Airplane("ABC2333", "Dhaka", LocalDate.of(2025, 10, 25));
        a.showDetails();
        a.flightStatus();
        a.flightDelay(10);
    }

}
