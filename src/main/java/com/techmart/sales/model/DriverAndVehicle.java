package com.techmart.sales.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "driver_vehicle")
public class DriverAndVehicle {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="driver_id")
        private Long id;
    
    @Column(name="first_name")
    private String firstName;
    
    @Column(name="last_name")
    private String lastName;
    

    
    @Column(name="mobile_no")
    private int mobileNo;
    
	
    @Column(name="vehicle_type")
    private String vehicleType;
    
    @Column(name="vehicle_plate_no")
    private String vehiclePlateNo;
    


}
