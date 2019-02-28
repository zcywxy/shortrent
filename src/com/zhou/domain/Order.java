package com.zhou.domain;

// default package

/**
 * Order entity. @author MyEclipse Persistence Tools
 */

public class Order implements java.io.Serializable {

	// Fields

	private Integer OId;
	private House house;
	private User user;
	private String inDate;
	private String outDate;
	private String orderDate;
	private Integer orderState;
	private Integer commentState;
	private Integer total;

	// Constructors

	/** default constructor */
	public Order() {
	}

	/** minimal constructor */
	public Order(House house, User user) {
		this.house = house;
		this.user = user;
	}

	/** full constructor */
	public Order(House house, User user, String inDate, String outDate,
			String orderDate, Integer orderState, Integer commentState,
			Integer total) {
		this.house = house;
		this.user = user;
		this.inDate = inDate;
		this.outDate = outDate;
		this.orderDate = orderDate;
		this.orderState = orderState;
		this.commentState = commentState;
		this.total = total;
	}

	// Property accessors

	public Integer getOId() {
		return this.OId;
	}

	public void setOId(Integer OId) {
		this.OId = OId;
	}

	public House getHouse() {
		return this.house;
	}

	public void setHouse(House house) {
		this.house = house;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getInDate() {
		return this.inDate;
	}

	public void setInDate(String inDate) {
		this.inDate = inDate;
	}

	public String getOutDate() {
		return this.outDate;
	}

	public void setOutDate(String outDate) {
		this.outDate = outDate;
	}

	public String getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public Integer getOrderState() {
		return this.orderState;
	}

	public void setOrderState(Integer orderState) {
		this.orderState = orderState;
	}

	public Integer getCommentState() {
		return this.commentState;
	}

	public void setCommentState(Integer commentState) {
		this.commentState = commentState;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

}