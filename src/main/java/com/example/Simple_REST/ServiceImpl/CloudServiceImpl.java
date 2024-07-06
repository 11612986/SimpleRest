package com.example.Simple_REST.ServiceImpl;

import com.example.Simple_REST.Model.CloudVendor;
import com.example.Simple_REST.Service.CloudVenodeService;
import com.example.Simple_REST.VendorRepository.CloudVendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CloudServiceImpl implements CloudVenodeService {

    @Autowired
    CloudVendorRepository vendorRepository;
    @Override
    public List<CloudVendor> Getvendor() {
        return vendorRepository.findAll();
    }


    @Override
    public Optional<CloudVendor> GetVendorbyID(Long VendorId) {
        return vendorRepository.findById(VendorId);
    }


    @Override
    public CloudVendor CreateVendor(CloudVendor vendor) {
        return vendorRepository.save(vendor);
    }

    @Override
    public CloudVendor UpdateVendor(CloudVendor vendor1, Long Id) {
        CloudVendor vendor=vendorRepository.findById(Id).orElseThrow(()-> new RuntimeException("User not found"));

        vendor.setVendorName(vendor1.getVendorName());
        vendor.setVendorPhone(vendor1.getVendorPhone());
        return vendorRepository.save(vendor);
    }

    @Override
    public void DeleteVendor(Long Id) {
     vendorRepository.deleteById(Id);
    }
}
