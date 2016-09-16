package com.bgrulers.repository;

import com.bgrulers.entity.ruler.Ruler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;

@Repository
public interface RulerRepository extends JpaRepository<Ruler, Long> {
	Collection<Ruler> findByNameIgnoreCase(@Param("name") String name);
    Collection<Ruler> findByDynastyNameIgnoreCaseOrderByReignStartAsc(@Param("dynastyName") String dynastyName);

	// Use for searches
	Collection<Ruler> findByNameContainingIgnoreCase(@Param("name") String name);

	// Use for searches
    @Query("select r from Ruler r where r.reignStart <= :reignDate and :reignDate <= r.reignEnd")
    Collection<Ruler> findByReignDate(@Param("reignDate") Date reignDate);

}
