package com.example.Simple_REST.Model;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name ="cloudvendor_table")
public class CloudVendor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vendorID;
    private  String vendorName;
    private String vendorAddress;
    private String vendorPhone;

    public CloudVendor() {
    }

    public CloudVendor(Long vendorID, String vendorName, String vendorAddress, String vendorPhone) {
        this.vendorID = vendorID;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhone = vendorPhone;
    }

    public Long getVendorID() {
        return vendorID;
    }

    public void setVendorID(Long vendorID) {
        this.vendorID = vendorID;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorPhone() {
        return vendorPhone;
    }

    public void setVendorPhone(String vendorPhone) {
        this.vendorPhone = vendorPhone;
    }
}
