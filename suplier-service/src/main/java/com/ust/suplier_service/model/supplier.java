package com.ust.suplier_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "supplier")
public class supplier {
    @Id
    public int id;
    public String orderid;
    public String orderweight;
    public String orderstatus;
    public String ordertype;
    public String orderdestination;
    public String ordercurrentlocation;
    public String orderpickuptime;
    public String orderpickupdate;
    public double price;
    public int retailerId;
}
