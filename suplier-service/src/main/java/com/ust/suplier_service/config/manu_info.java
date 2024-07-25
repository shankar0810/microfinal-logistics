package com.ust.suplier_service.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class manu_info {
    public int manu_id;
    public String manu_name;
    public String manu_address;
    public String manu_contact;
    public String manu_email;
    public String orderid;
}
