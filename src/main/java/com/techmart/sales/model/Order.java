package com.techmart.sales.model;



/*
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToOne;
import javax.persistence.Table;
//import javax.validation.constraints.Min;
//import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "order")*/

public class Order {
	
	/*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="order_id")
        private Long id;
    


	/*@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cus_id")
	private Customer customer_id;
	
   
	@ManyToOne
    @JoinColumn(name = "stock_id")
    private Stock stock;
	*/
	
 /*   @DateTimeFormat(pattern = "dd-MM-yyyy")
	@Column(name="order_date")
    private Date orderDate;
       
    @DateTimeFormat(pattern = "dd-MM-yyyy")
	@Column(name="delivery_date")
    private Date deliveryDate;*/
    
  /*  @Column(name="type")
    private String type;
    
    @Column(name="branch")
    private String branch;*/
    
  /*  @NotNull
    @Min(0)
    @Column(nullable = false, name="quantity")
    private Integer quantity;
    
    @Column(name="total")
    private float total;*/
    
   /* @ManyToOne
    @JoinColumn(name = "payment_id")
    private Payment payment;
    
    @ManyToOne
    @JoinColumn(name = "emp_id")
    private UserSalesAgent agent;
    */
    
   /* @Column(name="status")
    private String status;
    
    @Column(name="feedback")
    private String feedback;*/
}
