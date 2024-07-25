package com.ust.Customer_Service.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FullResponse {
    public int customerId;
    public String name;
    public String address;
    public String contactNumber;
    List<retailers> Retailers;
    List<supplier> Suppliers;
}
