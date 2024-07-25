package com.ust.Retailer_Service.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class supplier {
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
