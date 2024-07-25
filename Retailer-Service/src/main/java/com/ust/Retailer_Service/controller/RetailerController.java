package com.ust.Retailer_Service.controller;

import com.ust.Retailer_Service.Service.RetailerService;
import com.ust.Retailer_Service.config.Fullresponse;
import com.ust.Retailer_Service.model.retailer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/retailer")
public class RetailerController {
    @Autowired
    private RetailerService service;

    @PostMapping("/addretailer")
    public retailer addRetailer(@RequestBody retailer Retailer) {
        return service.addRetailer(Retailer);
    }
    @GetMapping("/findallretailers")
    public List<retailer> getAllRetailers() {
        return service.getAllRetailers();
    }

    @GetMapping("getOrderDetails/{retailerid}")
    public ResponseEntity<Fullresponse> getRetailerById(@PathVariable("retailerid") int id){
        return ResponseEntity.ok(service.getRetailerById(id));
    }

    @GetMapping("/findretailerbyid/{id}")
    public retailer findRetailerById(@PathVariable int id) {
        return service.findRetailerById(id);
    }

    @GetMapping("retailer/{customerid}")
    public List<retailer> findRetailerByCustomerId(@PathVariable("customerid") int id) {
        return service.findRetailerByCustomerId(id);
    }
}
