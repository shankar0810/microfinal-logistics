package com.ust.manufacturer_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "manu_details")
public class manu_info {
    @Id
    public int manu_id;
    public String manu_name;
    public String manu_address;
    public String manu_contact;
    public String manu_email;
    public String orderid;
}
