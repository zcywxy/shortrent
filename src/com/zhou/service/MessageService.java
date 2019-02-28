package com.zhou.service;

import java.io.Serializable;
import java.util.List;

import com.zhou.dao.BaseDAO;
import com.zhou.domain.Message;
import javax.persistence.Entity;

@Entity
public class MessageService{
	public void addMessage(Message message){
		BaseDAO.add(message);
	}
	public void deleteMessage(Message user){
		BaseDAO.delete(user);
	}
	public void changeMessage(String hql,List parameters){
		BaseDAO.update(hql, parameters);
	}
	public void findMessage(Class clazz, Serializable id){
		BaseDAO.get(clazz, id);
	}
	public List<Message> findMessages(String hql, List parameters){
		List<Message> messages=BaseDAO.query(hql, parameters);
		return messages;
	}
}
