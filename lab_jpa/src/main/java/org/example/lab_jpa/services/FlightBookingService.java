package org.example.lab_jpa.services;
import org.example.lab_jpa.models.FlightBooking;
import org.example.lab_jpa.repositories.FlightBookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightBookingService {
    private final FlightBookingRepository flightBookingRepository;
    public FlightBookingService(FlightBookingRepository flightBookingRepository){
        this.flightBookingRepository=flightBookingRepository;
    }
    public List<FlightBooking> findAll(){
        return flightBookingRepository.findAll();
    }
}

