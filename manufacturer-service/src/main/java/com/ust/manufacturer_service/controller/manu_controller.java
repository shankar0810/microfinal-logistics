package com.ust.manufacturer_service.controller;

import com.ust.manufacturer_service.model.manu_info;
import com.ust.manufacturer_service.service.manu_service;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/manufacturer")
public class manu_controller {
    @Autowired
    private manu_service service;

    @PostMapping("/addManufacturer")
    public manu_info addmanufacturer(manu_info manufacturer){
        return service.addmanufacturer(manufacturer);
    }

    @GetMapping("manufacturer/{orderid}")
    public ResponseEntity<List<manu_info>> getManuByOrderId(@PathVariable("orderid") String orderId){
        return ResponseEntity.ok(service.getmanufacturer(orderId));
    }

}
