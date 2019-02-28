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
	private List<Order> records;//�����б�
	private String h_message;
	public String getH_message() {
		return h_message;
	}
	public void setH_message(String h_message) {
		this.h_message = h_message;
	}
	@ManyToOne
	private User user;
	//�������ʹ��ONGL���еķ�����user���и�ֵ
	public House getHouse() {
		return house;
	}
	public void setHouse(House house) {
		this.house = house;
	}
	public String add() throws Exception {
			try{
				new HouseService().addHouse(house);
				h_message="�����ɹ�";
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
		//����׼������δ��ɵĶ����б�
		return "orders";
	}
	public String afterRecords() throws Exception {
		//����׼����������ɵĶ����б�
		return "orders";
	}
	public String allAfterRecords() throws Exception {
		//����׼��ȫ������ɵĶ����б����������ͷ���
		return "orders";
	}
	public String allRecords() throws Exception {
		//����׼��ȫ������ɵĶ����б����������ͷ���
		return "orders";
	}
	public String list() throws Exception {
		//����׼�������б�
		return "list";
	}
	public String houseDetail() throws Exception {
		//����׼�������б�
		return "house_detail";
	}
	public String nothing() throws Exception {
		//����׼�������б�
		return "nothing";
	}
	
}
