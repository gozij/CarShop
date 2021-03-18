package com.tts.myExoticCarShop.customer;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import java.sql.Date;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table
public class Customer {
	

	@Id
	@GeneratedValue
	
	private Long id;
	private String firstName;
	private String lastName;
	private String userName;
	
	
	@Column
	@CreationTimestamp
	private Date signedUp;
	
	
	
	public Customer() {}
	
    public Customer(String firstName, String lastName, String userName, Date signedUp){
	this.firstName = firstName;
	this.lastName = lastName;
	this.userName = userName;
	this.signedUp = signedUp;
}	

    
	
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getSignedUp() {
		return signedUp;
	}
	public void setSignedUp(Date signedUp) {
		this.signedUp = signedUp;
	}
	


}


	