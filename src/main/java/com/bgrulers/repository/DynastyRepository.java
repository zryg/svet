package com.bgrulers.repository;

import com.bgrulers.entity.Dynasty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DynastyRepository extends JpaRepository<Dynasty, Long> {
	
}
