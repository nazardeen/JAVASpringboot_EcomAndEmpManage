package com.techmart.sales.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.techmart.sales.model.UserSalesAgent;



public interface UserAgentRepo extends JpaRepository<UserSalesAgent, Long>{
	public List<UserSalesAgent> findByBranch(String branch);

}
