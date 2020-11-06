package com.riaz.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="studentAddress")
public class StudentAddress {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int addressId;
	@Override
	public String toString() {
		return "StudentAddress [addressId=" + addressId + ", addressDetail=" + addressDetail + "]";
	}
	String addressDetail;
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getAddressDetail() {
		return addressDetail;
	}
	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}
}
