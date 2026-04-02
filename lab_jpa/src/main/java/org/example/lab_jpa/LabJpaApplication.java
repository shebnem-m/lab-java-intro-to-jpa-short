package org.example.lab_jpa;

import org.example.lab_jpa.enums.CustomerStatus;
import org.example.lab_jpa.models.Customer;
import org.example.lab_jpa.models.Flight;
import org.example.lab_jpa.models.FlightBooking;
import org.example.lab_jpa.repositories.CustomerRepository;
import org.example.lab_jpa.repositories.FlightBookingRepository;
import org.example.lab_jpa.repositories.FlightRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LabJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabJpaApplication.class, args);
    }
    @Bean
    public CommandLineRunner run(CustomerRepository customerRepo, FlightRepository flightRepo, FlightBookingRepository bookingRepo) {
        return args -> {
            customerRepo.save(new Customer("Alice", CustomerStatus.Gold, 120000));
            customerRepo.save(new Customer("Bob", CustomerStatus.Silver, 50000));
            customerRepo.save(new Customer("Shebnem", CustomerStatus.Gold, 150000));


            flightRepo.save(new Flight("J2-011", "Boeing 737", 180, 2500));
            flightRepo.save(new Flight("TK-1991", "Airbus A320", 150, 3000));
            flightRepo.save(new Flight("AA-777", "Boeing 777", 300, 8000));


            bookingRepo.save(new FlightBooking(1, 1));
            bookingRepo.save(new FlightBooking(2, 2));
            bookingRepo.save(new FlightBooking(3, 1));

        };
    }
}
