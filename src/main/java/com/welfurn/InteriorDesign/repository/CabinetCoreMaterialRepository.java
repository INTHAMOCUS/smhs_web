package com.welfurn.InteriorDesign.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.welfurn.InteriorDesign.entity.CabinetCoreMaterial;
@Repository
public interface CabinetCoreMaterialRepository extends JpaRepository<CabinetCoreMaterial,Integer> {
	
	
	
	@Transactional
	@Modifying
	@Query("update cabinet_core_material c set c.ccmName=:ccmName where c.ccmId=:ccmId")
	public void updateCCMName(@Param("ccmId")Integer ccmId, @Param("ccmName") String ccmName);
	
	@Transactional
	@Modifying
	@Query("delete from cabinet_core_material c where c.ccm_id=:ccm_id")
	public void deleteCCM(@Param("ccm_id")Integer ccm_id);
	
	

}
