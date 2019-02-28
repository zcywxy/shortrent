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
 * 测试mysql数据库连接
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
			System.out.println("信息保存");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.session.close();
		}
	}

}
/*
 * Run as -->java application执行测试类就可以了;当控制台输出所执行的sql语句: Hibernate: insert into
 * user (USERNAME, USERID) values (?, ?)，信息保存表示数据库连接成功!
 */