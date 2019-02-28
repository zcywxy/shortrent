package com.zhou.service;

import java.io.Serializable;
import java.util.List;

import com.zhou.dao.BaseDAO;
import com.zhou.domain.User;
import javax.persistence.Entity;

@Entity
public class UserService{
	public void addUser(User user){
		BaseDAO.add(user);
	}
	public void deleteUser(User user){
		BaseDAO.delete(user);
	}
	public void changeUser(String hql,List parameters){
		BaseDAO.update(hql, parameters);
	}
	public void findUser(Class clazz, Serializable id){
		BaseDAO.get(clazz, id);
	}
	public List<User> findUsers(String hql, List parameters){
		List<User> users=BaseDAO.query(hql, parameters);
		return users;
	}
}
