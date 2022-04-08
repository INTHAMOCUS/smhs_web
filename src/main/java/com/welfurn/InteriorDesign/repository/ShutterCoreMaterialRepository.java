package com.welfurn.InteriorDesign.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.welfurn.InteriorDesign.entity.ShutterCoreMaterial;
@Repository
public interface ShutterCoreMaterialRepository extends JpaRepository<ShutterCoreMaterial,Integer>{
	
	@Transactional
	@Modifying
	@Query("update shutter_core_material s set s.scmPrice=:scmPrice where s.scmName=:scmName and s.scmId=:scmId")
	public void updateSCMPrice(@Param("scmId")Integer scmId, @Param("scmName") String scmName,@Param("scmPrice")float scmPrice);
	
	@Transactional
	@Modifying
	@Query("update shutter_core_material s set s.scmName=:scmName where s.scmId=:scmId")
	public void updateSCMName(@Param("scmId")Integer scmId, @Param("scmName") String scmName);
	
	@Transactional
	@Modifying
	@Query("update shutter_core_material s set s.baseCategory=:baseCategory where s.scmName=:scmName and s.scmId=:scmId")
	public void updateSCMBaseCategory(@Param("scmId")Integer scmId, @Param("scmName") String scmName,@Param("baseCategory")String baseCategory);
	
	
	@Transactional
	@Modifying
	@Query("delete from shutter_core_material s where s.scmId=:scmId")
	public void deleteSCM(@Param("scmId")Integer scm_id);

}
