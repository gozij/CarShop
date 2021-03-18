package com.tts.myExoticCarShop.BMW;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class BMW {
	
	@Id
	//@GeneratedValue
	@SequenceGenerator(
			name = "BMW_Sequence",
			sequenceName = "BMW_Sequence",
			allocationSize = 1
		
		)
	    @GeneratedValue(
	    		strategy = GenerationType.SEQUENCE,
	    		generator = "bmw_sequence"
	   )
	@Column
	private Long id;
	private String model;
	private  int year;
	private int milleage;
	private String price;

public BMW() {
	
	
}


public BMW(Long id, String model, int year, int milleage, String price) {
	super();
	this.id = id;
	this.model = model;
	this.year = year;
	this.milleage = milleage;
	this.price = price;
}


public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}


public String getModel() {
	return model;
}


public void setModel(String model) {
	this.model = model;
}


public int getYear() {
	return year;
}


public void setYear(int year) {
	this.year = year;
}


public int getMilleage() {
	return milleage;
}


public void setMilleage(int milleage) {
	this.milleage = milleage;
}


public String getPrice() {
	return price;
}


public void setPrice(String price) {
	this.price = price;
}


@Override
public String toString() {
	return "Sclass [id=" + id + ","
			+ " model=" + model + ", "
					+ "year=" + year + ", "
							+ "milleage=" 
					+ milleage + ", "
							+ "price=" + price
			+ "]";
}

}
	
	




