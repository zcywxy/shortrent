package com.zhou.domain;

// default package

/**
 * Comment entity. @author MyEclipse Persistence Tools
 */

public class Comment implements java.io.Serializable {

	// Fields

	private Integer CId;
	private House house;
	private User user;
	private String comment;

	// Constructors

	/** default constructor */
	public Comment() {
	}

	/** full constructor */
	public Comment(House house, User user, String comment) {
		this.house = house;
		this.user = user;
		this.comment = comment;
	}

	// Property accessors

	public Integer getCId() {
		return this.CId;
	}

	public void setCId(Integer CId) {
		this.CId = CId;
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

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}