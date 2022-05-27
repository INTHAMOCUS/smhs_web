package com.welfurn.InteriorDesign.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

//import com.welfurn.InteriorDesign.entity.Size;
import com.welfurn.InteriorDesign.entity.Sizing;

@Repository
public interface SizingRepository extends JpaRepository<Sizing,Integer>{
	
	@Query("select s from sizing s where s.id=:id")
	public Sizing findSize(@Param("id")Integer id);
	
	
	@Query("select s from sizing s where s.ccmName=:ccmName order by id asc")
	public List<Sizing> getSize(@Param("ccmName") String ccmName);
	
	
	
	@Transactional
	@Modifying
	@Query("update sizing s set s.ccmName=:ccmName,s.cabinetType=:cabinetType,s.width=:width,s.sqft=:sqft,s.height=:height,s.depth=:depth,s.price=:price where s.id=:id")
	public void updateSize(@Param("id")Integer id,@Param("ccmName") String ccmName,@Param("cabinetType")  String cabinetType,@Param("width") String width,@Param("height") String height,@Param("depth") String depth,@Param("sqft") String sqft,@Param("price") float price);
	

	@Transactional
	@Modifying
	@Query("delete from sizing s where s.id=:id")
	public void deleteSize(@Param("id")Integer s_id);
	

}
