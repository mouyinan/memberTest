package com.exfood.model;

/**
 * Food entity. @author MyEclipse Persistence Tools
 */

public class Food implements java.io.Serializable {

	// Fields

	private Integer foodid;
	private String foodname;
	private Double unitprice;
	private Double vipprice;

	// Constructors

	/** default constructor */
	public Food() {
	}

	/** full constructor */
	public Food(String foodname, Double unitprice, Double vipprice) {
		this.foodname = foodname;
		this.unitprice = unitprice;
		this.vipprice = vipprice;
	}

	// Property accessors

	public Integer getFoodid() {
		return this.foodid;
	}

	public void setFoodid(Integer foodid) {
		this.foodid = foodid;
	}

	public String getFoodname() {
		return this.foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}

	public Double getUnitprice() {
		return this.unitprice;
	}

	public void setUnitprice(Double unitprice) {
		this.unitprice = unitprice;
	}

	public Double getVipprice() {
		return this.vipprice;
	}

	public void setVipprice(Double vipprice) {
		this.vipprice = vipprice;
	}

}