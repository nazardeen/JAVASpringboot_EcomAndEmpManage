package com.techmart.sales.model;

	
	


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

	@Entity
	@Table(name = "stock")

	public class Stock {
		
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="id")
	    private Long id;
   
	 //   @Column(name="stock_name")
	    private String stockName;
	    
	  //  @Column(name="type")
	    private String type;
	    
	//    @Column(name="description")
	    private String description;
	    
	    @Lob
	    @Column(name="mainImage", columnDefinition = "MEDIUMBLOB")
	    private String mainImage;
	    
	    

	    
	    
	    
	    @Column(name="price")
	    private int price;
	    

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getStockName() {
			return stockName;
		}

		public void setStockName(String stockName) {
			this.stockName = stockName;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getMainImage() {
			return mainImage;
		}

		public void setMainImage(String mainImage) {
			this.mainImage = mainImage;
		}

		public float getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}
	
		

}
