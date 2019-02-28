package com.zhou.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.zhou.domain.House;
import com.zhou.domain.Order;
import com.zhou.domain.User;
import com.zhou.service.HouseService;
import com.zhou.service.UserService;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class HouseAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private House house;
	@Id
	@GeneratedValue
	private int house_id;
	public int getHouse_id() {
		return house_id;
	}
	public void setHouse_id(int house_id) {
		this.house_id = house_id;
	}
	@OneToMany
	private List<Order> records;//订单列表
	private String h_message;
	public String getH_message() {
		return h_message;
	}
	public void setH_message(String h_message) {
		this.h_message = h_message;
	}
	@ManyToOne
	private User user;
	//这里可以使用ONGL类中的方法对user进行赋值
	public House getHouse() {
		return house;
	}
	public void setHouse(House house) {
		this.house = house;
	}
	public String add() throws Exception {
			try{
				new HouseService().addHouse(house);
				h_message="创建成功";
				return SUCCESS;
			}catch (Exception e) {
				return ERROR;
			}
	}
	public String create() throws Exception {
		return INPUT;
	}
	public String orders() throws Exception {
		return "orders";
	}
	public String berforeRecords() throws Exception {
		//这里准备房客未完成的订单列表
		return "orders";
	}
	public String afterRecords() throws Exception {
		//这里准备房客已完成的订单列表
		return "orders";
	}
	public String allAfterRecords() throws Exception {
		//这里准备全部已完成的订单列表，包括房东和房客
		return "orders";
	}
	public String allRecords() throws Exception {
		//这里准备全部已完成的订单列表，包括房东和房客
		return "orders";
	}
	public String list() throws Exception {
		//这里准备房屋列表
		return "list";
	}
	public String houseDetail() throws Exception {
		//这里准备房屋列表
		return "house_detail";
	}
	public String nothing() throws Exception {
		//这里准备房屋列表
		return "nothing";
	}
	
}
