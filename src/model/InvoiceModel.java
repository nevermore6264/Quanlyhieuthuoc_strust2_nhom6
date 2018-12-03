package model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import entities.Account;
import entities.Invoices;
import util.HibernateUtil;

public class InvoiceModel {
	// Add
	
		public boolean addNew(Invoices invoice) {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = null;
			try {
				transaction = session.beginTransaction();
				session.save(invoice);
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
}
