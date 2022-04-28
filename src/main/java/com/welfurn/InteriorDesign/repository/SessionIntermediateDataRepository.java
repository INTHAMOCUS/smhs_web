package com.welfurn.InteriorDesign.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.welfurn.InteriorDesign.entity.SessionIntermediateData;


public interface SessionIntermediateDataRepository extends JpaRepository<SessionIntermediateData,Integer>{
	
	@Query("select s from session_intermediate_data s where s.customerId=:customerId")
	public List<SessionIntermediateData> findintData(@Param("customerId") Integer customerId);
	
	@Transactional
	@Modifying
	@Query("delete from session_intermediate_data s where s.id=:id")
	public void deleteIntData(@Param("id") Integer id);
	
	@Transactional
	@Modifying
	@Query("update session_intermediate_data s set s.layoutSelected=:layoutSelected,s.ccmSelected=:ccmSelected,s.scmSelected=:scmSelected,s.sizeSelected=:sizeSelected where s.id=:id")
	public void updateIntData(@Param("id")Integer id,@Param("layoutSelected") String layoutSelected,@Param("ccmSelected")  String ccmSelected,@Param("scmSelected") String scmSelected,@Param("sizeSelected") String sizeSelected);
	
	
}
