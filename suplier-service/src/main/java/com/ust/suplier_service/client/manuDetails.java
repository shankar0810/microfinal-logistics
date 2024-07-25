package com.ust.suplier_service.client;

import com.ust.suplier_service.config.manu_info;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "manu-service", url = "http://localhost:3332/manufacturer")
public interface manuDetails {
    @GetMapping("manufacturer/{orderid}")
    List<manu_info> getManuByOrderId(@PathVariable("orderid") String orderId);
}
