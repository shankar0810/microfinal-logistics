package com.ust.suplier_service.Repository;

import com.ust.suplier_service.model.supplier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface repo extends JpaRepository<supplier, Integer> {
    List<supplier> findByOrdertypeIn(List<String> ordertypes) ;

    List<supplier> findByRetailerId(int retailerId) ;

    Optional<supplier> findByOrderid(String orderid);
}
