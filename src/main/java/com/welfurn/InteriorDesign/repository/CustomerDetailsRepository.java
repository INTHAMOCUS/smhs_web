package com.welfurn.InteriorDesign.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.welfurn.InteriorDesign.entity.CustomerDetails;

public interface CustomerDetailsRepository extends JpaRepository<CustomerDetails,Integer> {

}
