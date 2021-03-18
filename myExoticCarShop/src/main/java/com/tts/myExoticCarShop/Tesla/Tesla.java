package com.tts.myExoticCarShop.Tesla;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Tesla {
	
	@Id
	//@GeneratedValue
	@SequenceGenerator(
			name = "Tesla_Sequence",
			sequenceName = "Tesla_Sequence",
			allocationSize = 1
		
		)
	    @GeneratedValue(
	    		strategy = GenerationType.SEQUENCE,
	    		generator = "tesla_sequence"
	   )
	@Column
	private Long id;
	private String model;
	private  int year;
	private int milleage;
	private String price;

public Tesla() {
	
	
}


public Tesla(Long id, String model, int year, int milleage, String price) {
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
	
	




