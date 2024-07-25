package com.ust.suplier_service.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FullResponse {
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
    List<manu_info> Manu_info;
}
