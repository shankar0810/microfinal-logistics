package com.ust.Retailer_Service.feignClient;

import com.ust.Retailer_Service.config.supplier;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "supplier-service", url = "http://localhost:3333/order")
public interface OrderDetails {
    @GetMapping("supplier/{retailerid}")
    List<supplier> getSupplierByRetailerId(@PathVariable("retailerid") int retailerId);
}
