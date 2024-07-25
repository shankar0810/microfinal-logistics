package com.ust.suplier_service.service;

import com.ust.suplier_service.Repository.repo;
import com.ust.suplier_service.client.manuDetails;
import com.ust.suplier_service.config.FullResponse;
import com.ust.suplier_service.config.manu_info;
import com.ust.suplier_service.model.supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

@Service
public class SupplierService {
    @Autowired
    private repo repository;

    @Autowired
    private manuDetails details;

    public supplier addOrder(supplier order) {
        return repository.save(order);
    }

    public supplier getOrderById(int id) {
        return repository.findById(id).orElse(null);
    }

    public List<supplier> getOrderByOrdertype(List<String> ordertype) {
        return  repository.findByOrdertypeIn(ordertype);
    }

    public List<supplier> getSupplierByRetailerId(int retailerId) {
        return repository.findByRetailerId(retailerId);
    }

    public FullResponse getManufacturerById(String orderid) {
        Optional<supplier> supplierOptional = repository.findByOrderid(orderid);
        if (supplierOptional.isPresent()) {
            supplier Supplier = supplierOptional.get();
            List<manu_info> p = details.getManuByOrderId(Supplier.getOrderid());
            FullResponse fullResponse = new FullResponse();
            fullResponse.setId(Supplier.getId());
            fullResponse.setOrderid(Supplier.getOrderid());
            fullResponse.setOrderweight(Supplier.getOrderweight());
            fullResponse.setOrderstatus(Supplier.getOrderstatus());
            fullResponse.setOrderpickupdate(Supplier.getOrderpickupdate());
            fullResponse.setOrderpickuptime(Supplier.getOrderpickuptime());
            fullResponse.setOrdercurrentlocation(Supplier.getOrdercurrentlocation());
            fullResponse.setOrderdestination(Supplier.getOrderdestination());
            fullResponse.setOrdertype(Supplier.getOrdertype());
            fullResponse.setPrice(Supplier.getPrice());
            fullResponse.setRetailerId(Supplier.getRetailerId());
            fullResponse.setManu_info(p);
            return fullResponse;
        } else {
            return null;
        }
    }

}
