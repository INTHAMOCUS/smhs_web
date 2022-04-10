package com.welfurn.InteriorDesign.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.welfurn.InteriorDesign.entity.Size;

@Repository
public interface SizeRepository extends JpaRepository<Size,Integer>{
	
	@Query("select s from size s where s.baseCategory=:baseCategory")
	public List<Size> getSize(@Param("baseCategory") String baseCategory);
	
	
	
	@Transactional
	@Modifying
	@Query("update size s set s.typeSize=:typeSize,s.baseCategory=:baseCategory,s.sqft=:sqft,s.price=:price where s.id=:id")
	public void updateSize(@Param("id")Integer id,@Param("typeSize") String typeSize,@Param("baseCategory")  String baseCategory,@Param("sqft") String sqft,@Param("price") float price);
	
	
	@Transactional
	@Modifying
	@Query("delete from size s where s.id=:id")
	public void deleteSize(@Param("id")Integer s_id);
	

}
