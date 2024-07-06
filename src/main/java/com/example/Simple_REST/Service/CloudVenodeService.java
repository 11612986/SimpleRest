package com.example.Simple_REST.Service;

import com.example.Simple_REST.Model.CloudVendor;

import java.util.List;
import java.util.Optional;

public interface CloudVenodeService {

  public List<CloudVendor> Getvendor();


  public Optional<CloudVendor> GetVendorbyID(Long VendorId);

  public CloudVendor CreateVendor(CloudVendor vendor);

  public CloudVendor UpdateVendor(CloudVendor vendor,Long ID);

  public void DeleteVendor(Long Id);



}
