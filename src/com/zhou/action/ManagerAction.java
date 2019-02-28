package com.zhou.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zhou.domain.Manager;
import com.zhou.service.ManagerService;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ManagerAction extends ActionSupport {

	/**
	 * 
	 */
	@ManyToOne
	private Manager manager;
	private String m_message;
	public String getM_message() {
		return m_message;
	}
	public void setM_message(String m_message) {
		this.m_message = m_message;
	}
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	@Id
	@GeneratedValue
	private static final long serialVersionUID = 1L;
	public String login() throws Exception {
		return INPUT;
	}
	@SuppressWarnings("static-access")
	public String loginTest() throws Exception {
		if(manager==null||manager.getMId()==null||manager.getMPassword()==null){
			return INPUT;
		}else{
			System.out.println("�������!"+super.SUCCESS);
			return SUCCESS;
			/*Manager ma=(Manager) new ManagerService().findObjById(Manager.class, manager.getMId());*/
			//if(ma.getMId()==manager.getMId()&&ma.getMPassword()==manager.getMPassword()){
				/*return SUCCESS;*/
			//}else{
				//System.out.println("�������");
				//return ERROR;
			//}
		}
	}
	public String users() throws Exception {
		//����׼��users���б�
		return "users";
	}
	public String list() throws Exception {
		//����׼��users���б�
		return "list";
	}
	public String message() throws Exception {
		//����׼��users���б�
		return "message";
	}
	public String nothing() throws Exception {
		//����׼��users���б�
		return "nothing";
	}
}
