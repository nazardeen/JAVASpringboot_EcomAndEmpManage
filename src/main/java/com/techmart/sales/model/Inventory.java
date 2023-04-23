package com.techmart.sales.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "inventory")
public class Inventory {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="inventory_id")
    private Long id;
	
    @Column(name="quantity")
    private int quantity;
	
    @Column(name="branch")
    private String branch;
	
}
