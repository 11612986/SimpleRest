package com.example.Simple_REST.VendorRepository;

import com.example.Simple_REST.Model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, Long> { // we cna also use CrudRepository


}
