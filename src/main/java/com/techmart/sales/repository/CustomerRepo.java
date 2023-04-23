package com.techmart.sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techmart.sales.model.Customer;


public interface CustomerRepo extends JpaRepository<Customer, Long> {

}

