package com.ust.Retailer_Service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "retailer")
public class retailer {
    @Id
    public int retailerId;
    public String retailerName;
    public String retailerAddress;
    public String contactNumber;
    public String email;
    public String serviceType;
    public double rating;
    public int yearsInBusiness;
    public String operationalHours;
    public double deliveryCharge;
    public String[] supportedRegions;
    public int customerId;
}
