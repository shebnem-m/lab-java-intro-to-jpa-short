package org.example.lab_jpa.repositories;

import org.example.lab_jpa.enums.CustomerStatus;
import org.example.lab_jpa.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findByCustomerStatus(CustomerStatus status);
    List<Customer> findByTotalCustomerMileageGreaterThan(Integer mileage);
}
