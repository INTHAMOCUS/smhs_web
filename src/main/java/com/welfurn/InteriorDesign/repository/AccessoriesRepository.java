package com.welfurn.InteriorDesign.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.welfurn.InteriorDesign.entity.Accessories;
@Repository
public interface AccessoriesRepository extends JpaRepository<Accessories,Integer> {

}
