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
	
	@Query("select c from cabinet_core_material c where c.ccmId=:ccmId")
	public CabinetCoreMaterial findCCM(@Param("ccmId") Integer ccmId);
	
	@Transactional
	@Modifying
	@Query("update cabinet_core_material c set c.ccmName=:ccmName where c.ccmId=:ccmId")
	public void updateCCMName(@Param("ccmId")Integer ccmId, @Param("ccmName") String ccmName);
	
	@Transactional
	@Modifying
	@Query("delete from cabinet_core_material c where c.ccmId=:ccmId")
	public void deleteCCM(@Param("ccmId")Integer ccm_id);
	
	

}
