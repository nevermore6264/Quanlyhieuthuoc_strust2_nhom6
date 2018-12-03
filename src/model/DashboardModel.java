package model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import entities.Invoices;
import util.HibernateUtil;

public class DashboardModel {
	@SuppressWarnings("unchecked")
	public List<Invoices> getInvoicesByDate(java.sql.Date birthSQL) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Query query = session.createSQLQuery("select * FROM Invoices where invDate>=:date");
			List<Invoices> lstInvoices = query.list();
			query.setParameter("date", birthSQL);
			System.out.println(lstInvoices);
			transaction.commit();
			return lstInvoices;
		} catch (Exception e) {
			if (!(transaction == null)) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
		return null;
	}

	public List<Invoices> getInvoices() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Query query = session.createQuery("FROM Invoices");
			@SuppressWarnings("unchecked")
			List<Invoices> lstInvoices = query.list();
			System.out.println(lstInvoices);
			transaction.commit();
			return lstInvoices;
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
	public List<Invoices> getInvoicesMoney() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Query query = session.createQuery("SELECT a.name,i.invId FROM Invoices i INNER JOIN i.Account a ");
			List<Invoices> lstInvoices = query.list();
			System.out.println(lstInvoices);
			transaction.commit();
			return lstInvoices;
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
	public List<Invoices> getInvoicesByaccId(int accId) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Query query = session.createQuery("FROM Invoices i where i.account.accId=:accId ");
			query.setParameter("accId", accId);
			List<Invoices> lstInvoices = query.list();
			System.out.println(lstInvoices);
			transaction.commit();
			return lstInvoices;
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
