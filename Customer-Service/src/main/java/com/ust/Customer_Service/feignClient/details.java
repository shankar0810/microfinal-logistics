package com.ust.Customer_Service.feignClient;

import com.ust.Customer_Service.config.retailers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "retailer-service", url = "http://localhost:3334/retailer")
public interface details {
    @GetMapping("retailer/{customerid}")
    List<retailers> findRetailerByCustomerId(@PathVariable("customerid")int id);
}
