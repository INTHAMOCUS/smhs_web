package com.welfurn.InteriorDesign.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.welfurn.InteriorDesign.entity.Size;

@Repository
public interface SizeRepository extends JpaRepository<Size,Integer>{

}
