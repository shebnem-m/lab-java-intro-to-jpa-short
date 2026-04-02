package org.example.lab_jpa.repositories;

import org.example.lab_jpa.models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight,Integer> {
}
