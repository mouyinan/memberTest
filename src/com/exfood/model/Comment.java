package com.exfood.model;

/**
 * Comment entity. @author MyEclipse Persistence Tools
 */

public class Comment implements java.io.Serializable {

	// Fields

	private Integer commentid;
	private Integer customer;
	private Integer food;
	private String information;

	// Constructors

	/** default constructor */
	public Comment() {
	}

	/** minimal constructor */
	public Comment(Integer customer) {
		this.customer = customer;
	}

	/** full constructor */
	public Comment(Integer customer, Integer food, String information) {
		this.customer = customer;
		this.food = food;
		this.information = information;
	}

	// Property accessors

	public Integer getCommentid() {
		return this.commentid;
	}

	public void setCommentid(Integer commentid) {
		this.commentid = commentid;
	}

	public Integer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Integer customer) {
		this.customer = customer;
	}

	public Integer getFood() {
		return this.food;
	}

	public void setFood(Integer food) {
		this.food = food;
	}

	public String getInformation() {
		return this.information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

}