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
	
	@Query("select * from size s where s.base_category=:baseCategory")
	public List<Size> getSize(@Param("base_category") String baseCategory);
	
	@Transactional
	@Modifying
	@Query("update size s set s.type_size=:typeSize where s.s_id=:id")
	public void updateSizeTypeSize(@Param("s_id")Integer id, @Param("type_size") String typeSize);
	
	
	@Transactional
	@Modifying
	@Query("update size s set s.base_category=:baseCategory where s.s_id=:id")
	public void updateSizeBaseCategory(@Param("s_id")Integer id, @Param("base_category") String baseCategory);
	
	
	@Transactional
	@Modifying
	@Query("update size s set s.sqft=:sqft where s.s_id=:id")
	public void updateSizeSqft(@Param("s_id")Integer id, @Param("sqft") String sqft);
	
	@Transactional
	@Modifying
	@Query("update size s set s.price=:price where s.s_id=:id")
	public void updateSizePrice(@Param("s_id")Integer id, @Param("price") float price);
	
	@Transactional
	@Modifying
	@Query("delete from size s where s.s_id=:s_id")
	public void deleteSize(@Param("s_id")Integer s_id);
	

}
