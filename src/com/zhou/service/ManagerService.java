package com.zhou.service;

import java.io.Serializable;
import java.util.List;

import com.zhou.dao.BaseDAO;
import com.zhou.domain.Manager;
import javax.persistence.Entity;

@Entity
public class ManagerService{
	public void addManager(Manager manager){
		BaseDAO.add(manager);
	}
	public void deleteManager(Manager user){
		BaseDAO.delete(user);
	}
	public void changeManager(String hql,List parameters){
		BaseDAO.update(hql, parameters);
	}
	public void findManager(Class clazz, Serializable id){
		BaseDAO.get(clazz, id);
	}
	public List<Manager> findManagers(String hql, List parameters){
		List<Manager> managers=BaseDAO.query(hql, parameters);
		return managers;
	}
}
