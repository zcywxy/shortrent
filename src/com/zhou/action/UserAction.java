package com.zhou.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String index;

	public String getIndex() {
		return index;
	}
	public String search() throws Exception {
		// TODO Auto-generated method stub
		if(index==null){
			return "input";
		}else{
			return "list";
		}
	}
	public void setIndex(String index) {
		this.index = index;
	}
}
