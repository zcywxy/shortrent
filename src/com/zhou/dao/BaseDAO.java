package com.zhou.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zhou.util.HibernateUtil;

public class BaseDAO {
	public static boolean add(Object obj) {
		Session session = null;
		Transaction tran = null;
		boolean result = false;
		try {
			session = HibernateUtil.getSession();
			tran = session.beginTransaction();
			session.save(obj);
			tran.commit();
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
			if (tran!= null) {
				tran.rollback();
			}
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return result;
	}

	public static boolean update(Object object) {
		Session session = null;
		Transaction tran = null;
		boolean result = false;
		try {
			session = HibernateUtil.getSession();
			tran = session.beginTransaction();
			session.update(object);
			tran.commit();
			result = true;
		} catch (Exception e) {
			if (tran != null) {
				// 回滚
				tran.rollback();
			}
		} finally {
			if (session != null) {
				// 关闭session
				session.close();
			}
		}
		return result;
	}

	
	public static Object get(Class c, Serializable id) {
		Session session = null;
		Object object = null;
		try {
			session = HibernateUtil.getSession();
			object = session.get(c, id);
		} catch (Exception e) {
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return object;
	}

	public static boolean delete(Object obj) {
		Session session = null;
		Transaction tran = null;
		boolean result = false;
		try {
			session = HibernateUtil.getSession();
			tran = session.beginTransaction();
			session.delete(obj);
			tran.commit();
			result = true;
		} catch (Exception e) {
			if (tran != null) {
				tran.rollback();
			}
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return result;
	}


	@SuppressWarnings("unchecked")
	public static <T> List<T> query(String sql, List param) {
		List<T> list = new ArrayList<T>();
		Session session = null;
		try {
			session = HibernateUtil.getSession();
			Query query = session.createQuery(sql);
			if (param != null) {
				for (int i = 0; i < param.size(); i++) {
					query.setParameter(i, param.get(i));
				}
			}
			list = query.list();
		} catch (Exception e) {
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return list;
	}

	public static Object queryOne(String sql, List param) {
		Object object = null;
		Session session = null;
		try {
			session = HibernateUtil.getSession();
			Query query = session.createQuery(sql);
			if (param != null) {
				for (int i = 0; i < param.size(); i++) {
					query.setParameter(i, param.get(i));
				}
				object = query.uniqueResult();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return object;
	}


	@SuppressWarnings("unchecked")
	public static <T> List<T> queryByPage(String sql, List param, int page,
			int size) {
		List<T> list = new ArrayList<T>();
		Session session = null;
		try {
			session = HibernateUtil.getSession();
			Query query = session.createQuery(sql);
			if (param != null) {
				for (int i = 0; i < param.size(); i++) {
					query.setParameter(i, param.get(i));
				}
			}
			query.setFirstResult((page - 1) * size);
			query.setMaxResults(size);
			list = query.list();
		} catch (Exception e) {
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return list;
	}


	public static int getCount(String hql, List pras) {
		int resu = 0;
		Session s = null;
		try {
			s = HibernateUtil.getSession();
			Query q = s.createQuery(hql);
			if (pras != null) {
				for (int i = 0; i < pras.size(); i++) {
					q.setParameter(i, pras.get(i));
				}
			}
			resu = Integer.valueOf(q.iterate().next().toString());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (s != null)
				s.close();
		}
		return resu;
	}
	
	

	public static boolean update(String hql,List param) {
		Session session = null;
		Transaction tran = null;
		boolean result = false;
		try {
			session = HibernateUtil.getSession();
			tran = session.beginTransaction();
			Query query = session.createQuery(hql);
			if (param != null) {
				for (int i = 0; i < param.size(); i++) {
					query.setParameter(i, param.get(i));
				}
			}
			query.executeUpdate();
			
			tran.commit();
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
			if (tran != null) {
				tran.rollback();
			}
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return result;
	}
	
	
}
