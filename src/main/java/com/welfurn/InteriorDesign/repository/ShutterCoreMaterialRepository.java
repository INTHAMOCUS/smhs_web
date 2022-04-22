package com.welfurn.InteriorDesign.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.welfurn.InteriorDesign.entity.ShutterCoreMaterial;
@Repository
public interface ShutterCoreMaterialRepository extends JpaRepository<ShutterCoreMaterial,Integer>{
	
	@Query("select s from shutter_core_material s where s.scmId=:scmId")
	public ShutterCoreMaterial findSCM(@Param("scmId")Integer scmId);
	
	
	@Transactional
	@Modifying
	@Query("update shutter_core_material s set s.baseCategory=:baseCategory,s.scmName=:scmName,s.scmPrice=:scmPrice where s.scmId=:scmId")
	public void updateSCM(@Param("scmId")Integer scmId, @Param("scmName") String scmName,@Param("scmPrice")float scmPrice,@Param("baseCategory")String baseCategory);
	
	
	
	@Transactional
	@Modifying
	@Query("delete from shutter_core_material s where s.scmId=:scmId")
	public void deleteSCM(@Param("scmId")Integer scm_id);
	
	
	@Query("select s from shutter_core_material s where s.baseCategory=:baseCategory")
	public List<ShutterCoreMaterial> getSCMforCustomer(@Param("baseCategory") String baseCategory);

}
