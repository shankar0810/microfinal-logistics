package com.ust.Customer_Service.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class retailers {
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
