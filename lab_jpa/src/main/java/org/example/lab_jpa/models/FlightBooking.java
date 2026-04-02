package org.example.lab_jpa.models;

import jakarta.persistence.*;

@Entity
public class FlightBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookingId;
    private Integer customerId;
    private Integer flightId;
    public FlightBooking(){}
    public FlightBooking(Integer customerId, Integer flightId){
        this.customerId=customerId;
        this.flightId=flightId;
    }

    public Integer getFlightId() {
        return flightId;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }
}
