package joerauk.hotelbookingsb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseSeeder implements CommandLineRunner {
    private BookingRepository bookingRepository;

    @Autowired
    public DatabaseSeeder(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public void run(String ... strings) throws Exception {
        List<HotelBooking> bookings = new ArrayList<>();

        bookings.add(new HotelBooking("Lancaster", 95, 2));
        bookings.add(new HotelBooking("Meols", 120.50, 5));
        bookings.add(new HotelBooking("Hilton", 200, 3));

        bookingRepository.saveAll(bookings);
    }
}
