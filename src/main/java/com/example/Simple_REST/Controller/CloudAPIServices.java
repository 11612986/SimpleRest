package com.example.Simple_REST.Controller;

import com.example.Simple_REST.Model.CloudVendor;
import com.example.Simple_REST.ServiceImpl.CloudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vendorcloud")
public class CloudAPIServices {
@Autowired
CloudServiceImpl vendor;
@GetMapping("/vendor/{vendorID}")
    public Optional<CloudVendor> GetVendorDetails(@PathVariable("vendorID") Long VendorID){
        return vendor.GetVendorbyID(VendorID);
//                ("C1", "Naga",
//                "123 apt 696", "123456");
    }
    @GetMapping("/vendor")
    public List<CloudVendor> GetData(){

    return vendor.Getvendor();
    }

    @PostMapping("/vendor")
    public String PostVendorDetails(@RequestBody CloudVendor vendor1)
    {
        vendor.CreateVendor(vendor1);
       return "Created Successfully";
    }

    @PutMapping("/vendor/{VendorID}")
    public String PutVendorDetails(@RequestBody CloudVendor vendor1,@PathVariable("VendorID") Long Id)
    {
        vendor.UpdateVendor(vendor1,Id);
        return "Updated succesfully";
    }

    @DeleteMapping("/vendor/{VendorID}")

    public String DeleteVendor(@PathVariable("VendorID") Long VendorID)
    {
        vendor.DeleteVendor(VendorID);

        return "Deleted Vedor is  "+VendorID;
    }

}
