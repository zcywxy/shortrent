package com.zhou.service;

import java.io.Serializable;
import java.util.List;

import com.zhou.dao.BaseDAO;
import com.zhou.domain.Comment;
import javax.persistence.Entity;

@Entity
public class CommentService{
	public void addComment(Comment comment){
		BaseDAO.add(comment);
	}
	public void deleteComment(Comment user){
		BaseDAO.delete(user);
	}
	public void changeComment(String hql,List parameters){
		BaseDAO.update(hql, parameters);
	}
	public void findComment(Class clazz, Serializable id){
		BaseDAO.get(clazz, id);
	}
	public List<Comment> findComments(String hql, List parameters){
		List<Comment> comments=BaseDAO.query(hql, parameters);
		return comments;
	}
}
