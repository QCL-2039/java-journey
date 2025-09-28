package OOP.Problem19;

import java.util.ArrayList;

public class TravelBooking {
    ArrayList<Flights> flights;
    ArrayList<Hotel> hotels;

    TravelBooking() {
        flights = new ArrayList<>();
        hotels = new ArrayList<>();
    }

    void seacrchFlight() {
        System.out.println("Here is our all available fligts: ");
        for (Flights f : flights) {
            System.out.println(f);
        }
    }

    void searchHotel() {
        for (Hotel h : hotels) {
            System.out.println(h);
        }
    }

    void bookFlight() {

    }

    void bookHotel() {

    }

    void cancelFlight() {

    }

    void cancelHotel() {

    }

}
