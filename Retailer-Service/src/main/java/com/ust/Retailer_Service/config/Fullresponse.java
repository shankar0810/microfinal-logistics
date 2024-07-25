package com.ust.Retailer_Service.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fullresponse {
    public int retailerId;
    public String retailerName;
    public String retailerAddress;
    public String contactNumber;
    public String email;
    public String operationalHours;
    List<supplier> Supplier;
}
