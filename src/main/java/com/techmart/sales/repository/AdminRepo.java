package com.techmart.sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.techmart.sales.model.Admin;

public interface AdminRepo extends JpaRepository<Admin, Long> {
	
	@Query("SELECT u FROM Admin u WHERE u.email = ?1")
	Admin findByEmail(String email);


}
