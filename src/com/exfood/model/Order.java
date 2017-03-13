package com.exfood.model;

/**
 * Order entity. @author MyEclipse Persistence Tools
 */

public class Order implements java.io.Serializable {

	// Fields

	private Integer orderid;
	private Integer food;
	private Integer foodnum;
	private Integer customer;
	private Double total;

	// Constructors

	/** default constructor */
	public Order() {
	}

	/** minimal constructor */
	public Order(Integer food) {
		this.food = food;
	}

	/** full constructor */
	public Order(Integer food, Integer foodnum, Integer customer, Double total) {
		this.food = food;
		this.foodnum = foodnum;
		this.customer = customer;
		this.total = total;
	}

	// Property accessors

	public Integer getOrderid() {
		return this.orderid;
	}

	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	public Integer getFood() {
		return this.food;
	}

	public void setFood(Integer food) {
		this.food = food;
	}

	public Integer getFoodnum() {
		return this.foodnum;
	}

	public void setFoodnum(Integer foodnum) {
		this.foodnum = foodnum;
	}

	public Integer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Integer customer) {
		this.customer = customer;
	}

	public Double getTotal() {
		return this.total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

}