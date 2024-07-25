package com.ust.Customer_Service.controller;

import com.ust.Customer_Service.config.FullResponse;
import com.ust.Customer_Service.model.customer;
import com.ust.Customer_Service.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService service;

    @PostMapping("/add")
    public customer addCustomer(@RequestBody customer Customer){
        return service.addCustomer(Customer);
    }

    @GetMapping("getRetailerCustomers/{customerid}")
    public ResponseEntity<FullResponse> findRetailerByCustomerId(@PathVariable("customerid") int id){
        return ResponseEntity.ok(service.getCustomerById(id));
    }

}
