package org.example.lab_jpa.repositories;

import org.example.lab_jpa.models.Customer;
import org.example.lab_jpa.models.Flight;
import org.example.lab_jpa.models.FlightBooking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlightBookingRepository extends JpaRepository<FlightBooking, Integer> {
     List<FlightBooking> findByCustomerId(Integer customerId);
     List<FlightBooking> findByFlightId(Integer flightId);
}
