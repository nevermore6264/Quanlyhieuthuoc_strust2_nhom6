package model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import entities.Account;
import entities.Drug;
import util.HibernateUtil;

public class DrugModel {
	// get drug
	@SuppressWarnings("unchecked")
	public List<Drug> getDrug() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Query Query = session.createQuery("FROM Drug");
			List<Drug> lsDrugs = Query.list();
			transaction.commit();
			System.out.println("1" + lsDrugs);
			return lsDrugs;
		} catch (Exception e) {
			if (!(transaction == null)) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
		return null;
	}

	// Lấy thuốc theo id
	public Drug getDrugById(String drugId) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Drug drug = (Drug) session.get(Drug.class, drugId);
			transaction.commit();
			return drug;
		} catch (Exception e) {
			if (!(transaction == null)) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
		return null;
	}
	
	

	// Search
	public List<Drug> searchDrugByName(String drugName) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Query query = session.createQuery("FROM Drug WHERE drugName like :drugName");
			query.setParameter("drugName", "%" + drugName + "%");
			List<Drug> lsDrugs = query.list();
			transaction.commit();
			System.out.println(lsDrugs);
			return lsDrugs;
		} catch (Exception e) {
			if (!(transaction == null)) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
		return null;
	}
	
	// Update drug.
		public boolean update(Drug drug) {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = null;
			try {
				transaction = session.beginTransaction();
				session.update(drug);
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

		// Add
		public boolean addNew(Drug drug) {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = null;
			try {
				transaction = session.beginTransaction();
				session.save(drug);
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
		
		// Delete
		public boolean delete(Drug drug) {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = null;
			try {
				transaction = session.beginTransaction();
				session.delete(drug);
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
