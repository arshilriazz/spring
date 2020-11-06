package com.telusko.DemoHib;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Person")
public class Person {
	@Id
	@GeneratedValue
	private int personId;
	private String personName;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="personDetailId")
	@GeneratedValue
	private PersonDetail pDetail;
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", pDetail=" + pDetail + "]";
	}
	public PersonDetail getpDetail() {
		return pDetail;
	}
	public void setpDetail(PersonDetail pDetail) {
		this.pDetail = pDetail;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
}
