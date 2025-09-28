package OOP.Problem19;

import java.time.LocalDate;

public class Flights {
    String flightNo;
    LocalDate flightDate;

    Flights(String flightNo, LocalDate flightDate) {
        this.flightNo = flightNo;
        this.flightDate = flightDate;
    }

    @Override
    public String toString() {
        return "Flight Number: " + flightNo + " Fligth Date: " + flightDate;
    }

}
