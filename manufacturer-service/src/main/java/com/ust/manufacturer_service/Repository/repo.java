package com.ust.manufacturer_service.Repository;

import com.ust.manufacturer_service.model.manu_info;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface repo extends JpaRepository<manu_info, Integer> {
    List<manu_info> findByOrderid(String orderid);
}
