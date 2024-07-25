package com.ust.Customer_Service.service;

import com.ust.Customer_Service.Repository.repo;
import com.ust.Customer_Service.config.FullResponse;
import com.ust.Customer_Service.config.retailers;
import com.ust.Customer_Service.config.supplier;
import com.ust.Customer_Service.feignClient.details;
import com.ust.Customer_Service.feignClient.supdetails;
import com.ust.Customer_Service.model.customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;


@Service
public class CustomerService {
    @Autowired
    private repo Repo;

    @Autowired
    private details Details;
    @Autowired
    private supdetails d;

    public customer addCustomer(customer Customer){
        return Repo.save(Customer);
    }

    public FullResponse getCustomerById(int id) {
        customer Customer = Repo.findById(id).orElse(null);
        FullResponse fullResponse = new FullResponse();
        if (Customer != null) {
            List<supplier> allSuppliers = new ArrayList<>();
            List<retailers> p = Details.findRetailerByCustomerId(id);
            for (retailers retailer : p) {
                int retailerId = retailer.getRetailerId();
                List<supplier> suppliers = d.getSupplierByRetailerId(retailerId);
                allSuppliers.addAll(suppliers);
            }
            fullResponse.setSuppliers(allSuppliers);
            fullResponse.setCustomerId(Customer.getCustomerId());
            fullResponse.setName(Customer.getName());
            fullResponse.setAddress(Customer.getAddress());
            fullResponse.setContactNumber(Customer.getContactNumber());
            fullResponse.setRetailers(p);
        }
        return fullResponse;
    }
}
