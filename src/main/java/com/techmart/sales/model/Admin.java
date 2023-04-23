package com.techmart.sales.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin")

public class Admin {


		
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="admin_id")
	    private Long admin_id;
		
	    
		@Column(nullable = false, unique = true, length = 45)
		private String email;
		
	    @Column(name="first_name", nullable = false, unique = true, length = 20)
	    private String firstName;
	    
	    @Column(name="last_name", nullable = false, unique = true, length = 20)
	    private String lastName;
	        
	    
	    @Column(name="password", nullable = false, length = 64)
	    private String password;


		public Long getAdmin_id() {
			return admin_id;
		}


	
	

		public void setAdmin_id(Long i) {
			this.admin_id = i;
		}
		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getFirstName() {
			return firstName;
		}


		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}





		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public String getLastName() {
			return lastName;
		}


		public void setLastName(String lastName) {
			this.lastName = lastName;
		}


	
	
	
	
}
