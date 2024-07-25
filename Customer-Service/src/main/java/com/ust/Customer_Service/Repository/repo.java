package com.ust.Customer_Service.Repository;

import com.ust.Customer_Service.model.customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repo extends JpaRepository<customer,Integer> {
}
