package org.example.lab_jpa.models;

import jakarta.persistence.*;

@Entity
public class FlightBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer BookingId;
    @ManyToOne
    @JoinColumn(name="customer_id", referencedColumnName = "customerId", nullable = false)
    private Customer customerId;
    @ManyToOne
    @JoinColumn(name="flight_id", referencedColumnName = "flightId", nullable = false)
    private Flight flightId;
    public FlightBooking(){}
    public FlightBooking(Customer customerId, Flight flightId){
        this.customerId=customerId;
        this.flightId=flightId;
    }

    public Flight getFlightId() {
        return flightId;
    }

    public Integer getBookingId() {
        return BookingId;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public void setBookingId(Integer bookingId) {
        this.BookingId = bookingId;
    }

    public void setFlightId(Flight flightId) {
        this.flightId = flightId;
    }
}
