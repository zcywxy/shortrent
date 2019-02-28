package com.zhou.service;

import java.io.Serializable;
import java.util.List;

import com.zhou.dao.BaseDAO;
import com.zhou.domain.House;
import javax.persistence.Entity;

@Entity
public class HouseService{
	public void addHouse(House house){
		BaseDAO.add(house);
	}
	public void deleteHouse(House user){
		BaseDAO.delete(user);
	}
	public void changeHouse(String hql,List parameters){
		BaseDAO.update(hql, parameters);
	}
	public void findHouse(Class clazz, Serializable id){
		BaseDAO.get(clazz, id);
	}
	public List<House> findHouses(String hql, List parameters){
		List<House> houses=BaseDAO.query(hql, parameters);
		return houses;
	}
}
