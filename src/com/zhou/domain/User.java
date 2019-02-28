package com.zhou.domain;

// default package

import java.util.HashSet;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer UId;
	private String UAddress;
	private String UEmail;
	private String UName;
	private String UPassword;
	private String UPhone;
	private String UPicture;
	private Integer USex;
	private Set houses = new HashSet(0);
	private Set comments = new HashSet(0);
	private Set messages = new HashSet(0);
	private Set orders = new HashSet(0);

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String UPassword) {
		this.UPassword = UPassword;
	}

	/** full constructor */
	public User(String UAddress, String UEmail, String UName, String UPassword,
			String UPhone, String UPicture, Integer USex, Set houses,
			Set comments, Set messages, Set orders) {
		this.UAddress = UAddress;
		this.UEmail = UEmail;
		this.UName = UName;
		this.UPassword = UPassword;
		this.UPhone = UPhone;
		this.UPicture = UPicture;
		this.USex = USex;
		this.houses = houses;
		this.comments = comments;
		this.messages = messages;
		this.orders = orders;
	}

	// Property accessors

	public Integer getUId() {
		return this.UId;
	}

	public void setUId(Integer UId) {
		this.UId = UId;
	}

	public String getUAddress() {
		return this.UAddress;
	}

	public void setUAddress(String UAddress) {
		this.UAddress = UAddress;
	}

	public String getUEmail() {
		return this.UEmail;
	}

	public void setUEmail(String UEmail) {
		this.UEmail = UEmail;
	}

	public String getUName() {
		return this.UName;
	}

	public void setUName(String UName) {
		this.UName = UName;
	}

	public String getUPassword() {
		return this.UPassword;
	}

	public void setUPassword(String UPassword) {
		this.UPassword = UPassword;
	}

	public String getUPhone() {
		return this.UPhone;
	}

	public void setUPhone(String UPhone) {
		this.UPhone = UPhone;
	}

	public String getUPicture() {
		return this.UPicture;
	}

	public void setUPicture(String UPicture) {
		this.UPicture = UPicture;
	}

	public Integer getUSex() {
		return this.USex;
	}

	public void setUSex(Integer USex) {
		this.USex = USex;
	}

	public Set getHouses() {
		return this.houses;
	}

	public void setHouses(Set houses) {
		this.houses = houses;
	}

	public Set getComments() {
		return this.comments;
	}

	public void setComments(Set comments) {
		this.comments = comments;
	}

	public Set getMessages() {
		return this.messages;
	}

	public void setMessages(Set messages) {
		this.messages = messages;
	}

	public Set getOrders() {
		return this.orders;
	}

	public void setOrders(Set orders) {
		this.orders = orders;
	}

}