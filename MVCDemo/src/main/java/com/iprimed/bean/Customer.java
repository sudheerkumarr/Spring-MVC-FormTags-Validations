package com.iprimed.bean;

import java.util.LinkedHashMap;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {
	
	private int custId;
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String custName;
	private String custEmail;
	private String plan;
	private String gender;
	private String[] terms;
	// Constructors
	public Customer() {
	
	}
	
	public Customer(int custId, String custName, String custEmail, String plan) {
		this.custId = custId;
		this.custName = custName;
		this.custEmail = custEmail;
		this.plan = plan;
	}
	
	// Getters and Setters
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTerms() {
		return terms;
	}

	public void setTerms(String terms) {
		this.terms = terms;
	}
}
