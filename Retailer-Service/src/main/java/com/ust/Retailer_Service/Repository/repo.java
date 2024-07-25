package com.ust.Retailer_Service.Repository;

import com.ust.Retailer_Service.model.retailer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface repo extends JpaRepository<retailer, Integer> {
    List<retailer> findByCustomerId(int id);
}
