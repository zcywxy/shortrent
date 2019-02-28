package com.zhou.service;

import java.io.Serializable;
import java.util.List;

import com.zhou.dao.BaseDAO;
import com.zhou.domain.Order;
import javax.persistence.Entity;

@Entity
public class OrderService {
	public void addOrder(Order order){
		BaseDAO.add(order);
	}
	public void deleteOrder(Order user){
		BaseDAO.delete(user);
	}
	public void changeOrder(String hql,List parameters){
		BaseDAO.update(hql, parameters);
	}
	public void findOrder(Class clazz, Serializable id){
		BaseDAO.get(clazz, id);
	}
	public List<Order> findOrders(String hql, List parameters){
		List<Order> orders=BaseDAO.query(hql, parameters);
		return orders;
	}
}
