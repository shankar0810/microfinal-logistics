package com.ust.Retailer_Service.Service;

import com.ust.Retailer_Service.Repository.repo;
import com.ust.Retailer_Service.config.Fullresponse;
import com.ust.Retailer_Service.config.supplier;
import com.ust.Retailer_Service.feignClient.OrderDetails;
import com.ust.Retailer_Service.model.retailer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RetailerService {
    @Autowired
    private repo repository;

    @Autowired
    private OrderDetails Details;

    public retailer addRetailer(retailer Retailer) {
        return repository.save(Retailer);
    }

    public List<retailer> getAllRetailers() {
        return repository.findAll();
    }

    public retailer findRetailerById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Fullresponse getRetailerById(int id) {
        retailer Retailer = repository.findById(id).orElse(null);
        Fullresponse fullResponse = new Fullresponse();
        if (Retailer != null) {
            List<supplier> suppliers = Details.getSupplierByRetailerId(Retailer.getRetailerId());
            fullResponse.setRetailerId(Retailer.getRetailerId());
            fullResponse.setRetailerName(Retailer.getRetailerName());
            fullResponse.setRetailerAddress(Retailer.getRetailerAddress());
            fullResponse.setContactNumber(Retailer.getContactNumber());
            fullResponse.setEmail(Retailer.getEmail());
            fullResponse.setOperationalHours(Retailer.getOperationalHours());
            fullResponse.setSupplier(suppliers);
        }
        return fullResponse;
    }

    public List<retailer> findRetailerByCustomerId(int id) {
        return repository.findByCustomerId(id);
    }
}
