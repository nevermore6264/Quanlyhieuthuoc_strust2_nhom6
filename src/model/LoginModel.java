package model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sun.javafx.runtime.eula.Eula;

import entities.*;
import util.HibernateUtil;

public class LoginModel {

	private static Transaction transaction;

	@SuppressWarnings({ "unchecked", "unused" })
	public static boolean logindb(String string, String string2) {

		// Session session = new
		// Configuration().configure("hibernate.cfg.xml").buildSessionFactory().getCurrentSession();
		Session session = HibernateUtil.getSessionFactory().openSession();
		// transaction = null;
		try {
			String sql = " FROM Account a where a.username=:name and a.password=:pass and a.accStatus= 1";
			// transaction.commit();
			Query query = session.createQuery(sql);
			query.setParameter("name", string);
			query.setParameter("pass", string2);
			List<Account> list = query.list();
			if (list.size() > 0) {
				System.out.println("g" + string + string2);
				session.close();
				return true;
			}
		} catch (Exception e) {
			// if (!(transaction == null)) {
			// transaction.rollback();
			// }
			System.out.println("khong co gi");
		}
		return false;
	}
	//Search by name.
			@SuppressWarnings("unchecked")
			public List<Account> searchAccountByName(String username) {
				Session session = HibernateUtil.getSessionFactory().openSession();
				Transaction transaction = null;
				try {
					transaction = session.beginTransaction();
					Query query = session
							.createQuery("select name FROM Account WHERE username like :username");
					query.setParameter("username", "%" + username + "%");
					List<Account> lstAccounts = query.list();
					transaction.commit();
					return lstAccounts;
				} catch (Exception e) {
					if (!(transaction == null)) {
						transaction.rollback();
					}
				} finally {
					session.close();
				}
				return null;
			}
			
			@SuppressWarnings("unchecked")
			public List<Account> searchAccountByName2(String username) {
				Session session = HibernateUtil.getSessionFactory().openSession();
				Transaction transaction = null;
				try {
					transaction = session.beginTransaction();
					Query query = session
							.createQuery("select roles FROM Account WHERE username like :username");
					query.setParameter("username", "%" + username + "%");
					List<Account> lstAccounts = query.list();
					transaction.commit();
					return lstAccounts;
				} catch (Exception e) {
					if (!(transaction == null)) {
						transaction.rollback();
					}
				} finally {
					session.close();
				}
				return null;
			}
}
