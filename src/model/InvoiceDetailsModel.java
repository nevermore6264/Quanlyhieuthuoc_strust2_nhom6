package model;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import entities.InvoiceDetails;
import entities.Invoices;
import util.HibernateUtil;

public class InvoiceDetailsModel {
	public boolean f(InvoiceDetails invoiceDetails) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(invoiceDetails);
			System.out.println(invoiceDetails);
			transaction.commit();
			return true;
		} catch (Exception e) {
			if (!(transaction == null)) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	public List<InvoiceDetails> searchDetails(String id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Query query = session.createQuery("FROM InvoiceDetails where invoices.invId=:id");
			query.setParameter("id", id);
			System.out.println(id);
			List<InvoiceDetails> lstDetails = query.list();
			transaction.commit();
			System.out.println(lstDetails.get(0).getInvId());
			return lstDetails;
		} catch (Exception e) {
			if (!(transaction == null)) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
		return null;
	}

	// Get inv by id.
	public Invoices getinvByID(String invId) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Invoices Id = (Invoices) session.get(Invoices.class, invId);
			transaction.commit();
			return Id;
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
	public List<InvoiceDetails> searchDetails() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Query query = session.createQuery("FROM InvoiceDetails");
			List<InvoiceDetails> lstDetails = query.list();
			transaction.commit();
			System.out.println(lstDetails.get(0).getInvId());
			return lstDetails;
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
	public List<InvoiceDetails> searchDetailsT(String id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Query query = session.createQuery("select sum(price) FROM InvoiceDetails where invoices.invId=:id");
			query.setParameter("id", id);
			System.out.println(id);
			List<InvoiceDetails> lstDetails = query.list();
			transaction.commit();
			System.out.println("listx:"+lstDetails);
			return lstDetails;
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
