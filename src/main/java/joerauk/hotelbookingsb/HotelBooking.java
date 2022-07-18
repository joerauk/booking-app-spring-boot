package joerauk.hotelbookingsb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HotelBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String hotelName;
    private double pricePerNight;
    private int numOfNights;

    public HotelBooking(String hotelName, double pricePerNight, int numOfNights) {
        this.hotelName = hotelName;
        this.pricePerNight = pricePerNight;
        this.numOfNights = numOfNights;
    }

    public HotelBooking(){}

    public String getHotelName() {
        return hotelName;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public double getTotalPrice() {
        return pricePerNight * numOfNights;
    }

    public long getId() {
        return id;
    }
}
