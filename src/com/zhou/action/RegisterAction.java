package com.zhou.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zhou.dao.BaseDAO;
import com.zhou.domain.User;
import com.zhou.service.UserService;
import com.zhou.util.HibernateUtil;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class RegisterAction extends ActionSupport{
	@Id
	@GeneratedValue
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private User user;
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public String add() throws Exception {
			try{
				
				return SUCCESS;
				//BaseDAO.add(user);
				//setMessage("×¢²á³É¹¦£¡");
			}catch (Exception e) {
				setMessage("×¢²áÊ§°Ü£¬Error Input!");
				return ERROR;
			}
	}
	public String regist() throws Exception {
		return INPUT;
	}
	public String login() throws Exception {
		return "login";
	}
	public String loginTest() throws Exception {
		return SUCCESS;
		/*System.out.println(((User)BaseDAO.get(User.class, user.getUName())).getUName());*/
		/*if(BaseDAO.get(User.class, user.getUId())!=null){			
			return SUCCESS;
		}else{
			return "login";
		}*/
	}
	public String nothing() throws Exception {
		return "nothing";
	}
}
