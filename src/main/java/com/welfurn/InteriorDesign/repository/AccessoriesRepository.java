package com.welfurn.InteriorDesign.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.welfurn.InteriorDesign.entity.Accessories;

@Repository
public interface AccessoriesRepository extends JpaRepository<Accessories,Integer> {
	
	@Query("select a from accessories a where a.cabinetType=:cabinetType order by id asc")
	public List<Accessories> getAccessories(@Param("cabinetType") String cabinetType);
	
	@Query("select a from accessories a where a.id=:id")
	public Accessories findAccessories(@Param("id")Integer id);
	
	
	@Transactional
	@Modifying
	@Query("update accessories s set s.cabinetType=:cabinetType,s.cabinetDesc=:cabinetDesc,s.width=:width,s.accessoriesType=:accessoriesType where s.id=:id")
	public void updateAccessories(@Param("id")Integer id,@Param("cabinetType") String cabinetType, @Param("cabinetDesc") String cabinetDesc,@Param("width") String width,@Param("accessoriesType") String accessoriesType);
	
	
	@Transactional
	@Modifying
	@Query("delete from accessories s where s.id=:id")
	public void deleteAccessories(@Param("id")Integer id);
	


}
