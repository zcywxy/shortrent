package com.zhou.domain;

// default package

import java.util.HashSet;
import java.util.Set;

/**
 * House entity. @author MyEclipse Persistence Tools
 */

public class House implements java.io.Serializable {

	// Fields

	private Integer HId;
	private User user;
	private String HAddress;
	private String HArea;
	private Integer HBedNumber;
	private String HBedType;
	private Integer HDayCost;
	private String HDescription;
	private String HHouseType;
	private String HInTime;
	private Integer HLivingRoomNumber;
	private Integer HMaxDays;
	private Integer HMinDays;
	private String HName;
	private String HOutTime;
	private String HPayRule;
	private Integer HPeopleNumber;
	private String HRentType;
	private String HReturnMoneyDay;
	private Integer HRoomNumber;
	private String HService;
	private String HUsingRule;
	private Integer HWashRoomNumber;
	private String picture1;
	private String picture2;
	private String picture3;
	private Set comments = new HashSet(0);
	private Set orders = new HashSet(0);

	// Constructors

	/** default constructor */
	public House() {
	}

	/** full constructor */
	public House(User user, String HAddress, String HArea, Integer HBedNumber,
			String HBedType, Integer HDayCost, String HDescription,
			String HHouseType, String HInTime, Integer HLivingRoomNumber,
			Integer HMaxDays, Integer HMinDays, String HName, String HOutTime,
			String HPayRule, Integer HPeopleNumber, String HRentType,
			String HReturnMoneyDay, Integer HRoomNumber, String HService,
			String HUsingRule, Integer HWashRoomNumber, String picture1,
			String picture2, String picture3, Set comments, Set orders) {
		this.user = user;
		this.HAddress = HAddress;
		this.HArea = HArea;
		this.HBedNumber = HBedNumber;
		this.HBedType = HBedType;
		this.HDayCost = HDayCost;
		this.HDescription = HDescription;
		this.HHouseType = HHouseType;
		this.HInTime = HInTime;
		this.HLivingRoomNumber = HLivingRoomNumber;
		this.HMaxDays = HMaxDays;
		this.HMinDays = HMinDays;
		this.HName = HName;
		this.HOutTime = HOutTime;
		this.HPayRule = HPayRule;
		this.HPeopleNumber = HPeopleNumber;
		this.HRentType = HRentType;
		this.HReturnMoneyDay = HReturnMoneyDay;
		this.HRoomNumber = HRoomNumber;
		this.HService = HService;
		this.HUsingRule = HUsingRule;
		this.HWashRoomNumber = HWashRoomNumber;
		this.picture1 = picture1;
		this.picture2 = picture2;
		this.picture3 = picture3;
		this.comments = comments;
		this.orders = orders;
	}

	// Property accessors

	public Integer getHId() {
		return this.HId;
	}

	public void setHId(Integer HId) {
		this.HId = HId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getHAddress() {
		return this.HAddress;
	}

	public void setHAddress(String HAddress) {
		this.HAddress = HAddress;
	}

	public String getHArea() {
		return this.HArea;
	}

	public void setHArea(String HArea) {
		this.HArea = HArea;
	}

	public Integer getHBedNumber() {
		return this.HBedNumber;
	}

	public void setHBedNumber(Integer HBedNumber) {
		this.HBedNumber = HBedNumber;
	}

	public String getHBedType() {
		return this.HBedType;
	}

	public void setHBedType(String HBedType) {
		this.HBedType = HBedType;
	}

	public Integer getHDayCost() {
		return this.HDayCost;
	}

	public void setHDayCost(Integer HDayCost) {
		this.HDayCost = HDayCost;
	}

	public String getHDescription() {
		return this.HDescription;
	}

	public void setHDescription(String HDescription) {
		this.HDescription = HDescription;
	}

	public String getHHouseType() {
		return this.HHouseType;
	}

	public void setHHouseType(String HHouseType) {
		this.HHouseType = HHouseType;
	}

	public String getHInTime() {
		return this.HInTime;
	}

	public void setHInTime(String HInTime) {
		this.HInTime = HInTime;
	}

	public Integer getHLivingRoomNumber() {
		return this.HLivingRoomNumber;
	}

	public void setHLivingRoomNumber(Integer HLivingRoomNumber) {
		this.HLivingRoomNumber = HLivingRoomNumber;
	}

	public Integer getHMaxDays() {
		return this.HMaxDays;
	}

	public void setHMaxDays(Integer HMaxDays) {
		this.HMaxDays = HMaxDays;
	}

	public Integer getHMinDays() {
		return this.HMinDays;
	}

	public void setHMinDays(Integer HMinDays) {
		this.HMinDays = HMinDays;
	}

	public String getHName() {
		return this.HName;
	}

	public void setHName(String HName) {
		this.HName = HName;
	}

	public String getHOutTime() {
		return this.HOutTime;
	}

	public void setHOutTime(String HOutTime) {
		this.HOutTime = HOutTime;
	}

	public String getHPayRule() {
		return this.HPayRule;
	}

	public void setHPayRule(String HPayRule) {
		this.HPayRule = HPayRule;
	}

	public Integer getHPeopleNumber() {
		return this.HPeopleNumber;
	}

	public void setHPeopleNumber(Integer HPeopleNumber) {
		this.HPeopleNumber = HPeopleNumber;
	}

	public String getHRentType() {
		return this.HRentType;
	}

	public void setHRentType(String HRentType) {
		this.HRentType = HRentType;
	}

	public String getHReturnMoneyDay() {
		return this.HReturnMoneyDay;
	}

	public void setHReturnMoneyDay(String HReturnMoneyDay) {
		this.HReturnMoneyDay = HReturnMoneyDay;
	}

	public Integer getHRoomNumber() {
		return this.HRoomNumber;
	}

	public void setHRoomNumber(Integer HRoomNumber) {
		this.HRoomNumber = HRoomNumber;
	}

	public String getHService() {
		return this.HService;
	}

	public void setHService(String HService) {
		this.HService = HService;
	}

	public String getHUsingRule() {
		return this.HUsingRule;
	}

	public void setHUsingRule(String HUsingRule) {
		this.HUsingRule = HUsingRule;
	}

	public Integer getHWashRoomNumber() {
		return this.HWashRoomNumber;
	}

	public void setHWashRoomNumber(Integer HWashRoomNumber) {
		this.HWashRoomNumber = HWashRoomNumber;
	}

	public String getPicture1() {
		return this.picture1;
	}

	public void setPicture1(String picture1) {
		this.picture1 = picture1;
	}

	public String getPicture2() {
		return this.picture2;
	}

	public void setPicture2(String picture2) {
		this.picture2 = picture2;
	}

	public String getPicture3() {
		return this.picture3;
	}

	public void setPicture3(String picture3) {
		this.picture3 = picture3;
	}

	public Set getComments() {
		return this.comments;
	}

	public void setComments(Set comments) {
		this.comments = comments;
	}

	public Set getOrders() {
		return this.orders;
	}

	public void setOrders(Set orders) {
		this.orders = orders;
	}

}