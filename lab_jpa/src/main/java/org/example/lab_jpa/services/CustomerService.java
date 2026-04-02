package org.example.lab_jpa.services;
import org.example.lab_jpa.models.Customer;
import org.example.lab_jpa.models.FlightBooking;
import org.example.lab_jpa.repositories.CustomerRepository;
import org.example.lab_jpa.repositories.FlightBookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;
    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository=customerRepository;
    }
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }
}

