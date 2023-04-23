package com.techmart.sales.model;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "payment")
public class Payment {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="payment_id")
    private Long id;
	
	/*@OneToMany(mappedBy = "payment")
	private Set<Order> orders = new HashSet<>();*/
	
    @Column(name="amount")
    private float amount;
	
    @Column(name="pay_method")
    private String payMethod;
    
    @Column(name="status")
    private String status;
}
