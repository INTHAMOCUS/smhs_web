package com.welfurn.InteriorDesign.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.welfurn.InteriorDesign.entity.Layout;

public interface LayoutRepository extends JpaRepository<Layout,Integer> {
	
	@Query("select l from layout l where l.id=:id")
	public Layout findlayout(@Param("id") Integer id);
	
	@Transactional
	@Modifying
	@Query("update layout l set l.layoutName=:layoutName where l.id=:id")
	public void updateLayoutName(@Param("id")Integer id, @Param("layoutName") String layout_name);
	
	@Transactional
	@Modifying
	@Query("delete from layout l where l.id=:id")
	public void deleteLayout(@Param("id")Integer id);

}
