package com.zhou.domain;

// default package

/**
 * Manager entity. @author MyEclipse Persistence Tools
 */

public class Manager implements java.io.Serializable {

	// Fields

	private Integer MId;
	private String MPassword;

	// Constructors

	/** default constructor */
	public Manager() {
	}

	/** full constructor */
	public Manager(String MPassword) {
		this.MPassword = MPassword;
	}

	// Property accessors

	public Integer getMId() {
		return this.MId;
	}

	public void setMId(Integer MId) {
		this.MId = MId;
	}

	public String getMPassword() {
		return this.MPassword;
	}

	public void setMPassword(String MPassword) {
		this.MPassword = MPassword;
	}

}