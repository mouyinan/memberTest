package com.exfood.model;

/**
 * Customer entity. @author MyEclipse Persistence Tools
 */

public class Customer implements java.io.Serializable {

	// Fields

	private Integer customerid;
	private String name;
	private String address;
	private Integer phone;
	private Integer role;

	// Constructors

	/** default constructor */
	public Customer() {
	}

	/** minimal constructor */
	public Customer(String name, String address, Integer phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	/** full constructor */
	public Customer(String name, String address, Integer phone, Integer role) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.role = role;
	}

	// Property accessors

	public Integer getCustomerid() {
		return this.customerid;
	}

	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getPhone() {
		return this.phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public Integer getRole() {
		return this.role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

}