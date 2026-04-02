package org.example.lab_jpa.models;

import jakarta.persistence.*;
import org.example.lab_jpa.enums.CustomerStatus;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;
    @Column(nullable = false)
    private String customerName;
    @Enumerated(EnumType.STRING)
    @Column(nullable=false)
    private CustomerStatus customerStatus;
    @Column(nullable=false)
    private Integer totalCustomerMileage;
    public Customer(){}
    public Customer( String customerName, CustomerStatus customerStatus, Integer totalCustomerMileage){
        this.customerName=customerName;
        this.customerStatus=customerStatus;
        this.totalCustomerMileage=totalCustomerMileage;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public Integer getTotalCustomerMileage() {
        return totalCustomerMileage;
    }

    public CustomerStatus getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public void setCustomerStatus(CustomerStatus customerStatus) {
        this.customerStatus = customerStatus;
    }

    public void setTotalCustomerMileage(Integer totalCustomerMileage) {
        this.totalCustomerMileage = totalCustomerMileage;
    }
}
