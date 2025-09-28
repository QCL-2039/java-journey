package OOP.Problem19;

public class Hotel {
    String hotelName;
    double rentCost;

    Hotel(String hotelName, double rentCost) {
        this.hotelName = hotelName;
        this.rentCost = rentCost;
    }

    @Override
    public String toString() {
        return "Hotel Name: " + hotelName + " Rent Cost: " + rentCost;
    }

}
