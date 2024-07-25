package com.ust.suplier_service.controller;

import com.ust.suplier_service.config.FullResponse;
import com.ust.suplier_service.model.supplier;
import com.ust.suplier_service.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/order")
public class SupplierController {
    @Autowired
    private SupplierService supplierService;

    @PostMapping("/addorder")
    public supplier addOrder(@RequestBody supplier order) {
        return supplierService.addOrder(order);
    }
    @GetMapping("/getOrder/{id}")
    public supplier getOrderById(@PathVariable("id") int id) {
        return supplierService.getOrderById(id);
    }
    @GetMapping("/getOrderbytype/{Ordertype}")
    public List<supplier> getOrderByType(@PathVariable("Ordertype") String ordertype) {
        List<String> orderTypes = Arrays.asList(ordertype.split(","));
        return supplierService.getOrderByOrdertype(orderTypes);
    }

    @GetMapping("supplier/{retailerid}")
    public ResponseEntity<List<supplier>> getSupplierByRetailerId(@PathVariable("retailerid") int retailerId){
        return ResponseEntity.ok(supplierService.getSupplierByRetailerId(retailerId));
    }

    @GetMapping("/getManufacturerByOrderId/{orderid}")
    public ResponseEntity<FullResponse> getManufacturerById(@PathVariable("orderid") String orderId){
        return ResponseEntity.ok(supplierService.getManufacturerById(orderId));
    }
}
