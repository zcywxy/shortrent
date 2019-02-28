package com.zhou.test;

import javax.persistence.Entity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zhou.dao.BaseDAO;
import com.zhou.domain.User;
import com.zhou.util.HibernateUtil;

/**
 * ����mysql���ݿ�����
 * 
 * @author Administrator
 * 
 */
@Entity
public class TestHibernate {

	private Session session = null;
	private Transaction tran = null;

	public static void main(String[] args) {
		User user = (User) BaseDAO.get(User.class, 1);
		user.setUName("come");
		user.setUPassword("zzc");
		new TestHibernate().save(user);
	}

	public TestHibernate() {
		Configuration configure = new Configuration().configure();
		@SuppressWarnings("deprecation")
		SessionFactory factory = configure.buildSessionFactory();
		this.session = factory.openSession();
	}

	public void save(User user) {

		try {
			tran = this.session.beginTransaction();
			this.session.save(user);
			tran.commit();
			System.out.println("��Ϣ����");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.session.close();
		}
	}

}
/*
 * Run as -->java applicationִ�в�����Ϳ�����;������̨�����ִ�е�sql���: Hibernate: insert into
 * user (USERNAME, USERID) values (?, ?)����Ϣ�����ʾ���ݿ����ӳɹ�!
 */