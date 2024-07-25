package com.ust.manufacturer_service.service;

import com.ust.manufacturer_service.Repository.repo;
import com.ust.manufacturer_service.model.manu_info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class manu_service {
    @Autowired
    private repo Repo;

    public manu_info addmanufacturer(manu_info manufacturer) {
        return Repo.save(manufacturer);
    }

    public List<manu_info> getmanufacturer(String orderid) {
        return Repo.findByOrderid(orderid);
    }
}
