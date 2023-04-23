package com.techmart.sales.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.techmart.sales.model.Stock;


@Repository
public interface StockRepo extends JpaRepository<Stock,Long> {

//	List<Stock> findByNameContainingIgnoreCase(String stockName);
	
}
