package OOP.Problem19;

import java.time.LocalDate;

public class Tester {

    public static void main(String[] args) {
        Flights f = new Flights("ABC1010", LocalDate.of(2025, 10, 25));
        TravelBooking travelBooking = new TravelBooking();
        travelBooking.flights.add(f);
        // Customer c = new Customer("Sohel Rana");

    }
}
