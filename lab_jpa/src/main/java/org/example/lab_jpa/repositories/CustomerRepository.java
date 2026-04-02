package org.example.lab_jpa.repositories;

import org.example.lab_jpa.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
