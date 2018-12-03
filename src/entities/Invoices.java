package entities;
// Generated Aug 20, 2017 10:09:53 PM by Hibernate Tools 5.2.5.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Invoices generated by hbm2java
 */
@Entity
@Table(name = "Invoices", catalog = "QuanLyThuoc")
public class Invoices implements java.io.Serializable {

	private String invId;
	private Account account;
	private Date invDate;
	private String customer;
	private BigDecimal invTotal;
	private boolean invStatus;
	private Set<InvoiceDetails> invoiceDetailses = new HashSet<InvoiceDetails>(0);

	public Invoices() {
	}

	public Invoices(String invId, Account account, Date invDate, String customer, BigDecimal invTotal,
			boolean invStatus) {
		this.invId = invId;
		this.account = account;
		this.invDate = invDate;
		this.customer = customer;
		this.invTotal = invTotal;
		this.invStatus = invStatus;
	}

	public Invoices(String invId, Account account, Date invDate, String customer, BigDecimal invTotal,
			boolean invStatus, Set<InvoiceDetails> invoiceDetailses) {
		this.invId = invId;
		this.account = account;
		this.invDate = invDate;
		this.customer = customer;
		this.invTotal = invTotal;
		this.invStatus = invStatus;
		this.invoiceDetailses = invoiceDetailses;
	}

	@Id

	@Column(name = "INV_ID", unique = true, nullable = false, length = 10)
	public String getInvId() {
		return this.invId;
	}

	public void setInvId(String invId) {
		this.invId = invId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AccId", nullable = false)
	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "INV_DATE", nullable = false, length = 23)
	public Date getInvDate() {
		return this.invDate;
	}

	public void setInvDate(Date invDate) {
		this.invDate = invDate;
	}

	@Column(name = "CUSTOMER", nullable = false)
	public String getCustomer() {
		return this.customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	@Column(name = "INV_TOTAL", nullable = false, scale = 4)
	public BigDecimal getInvTotal() {
		return this.invTotal;
	}

	public void setInvTotal(BigDecimal invTotal) {
		this.invTotal = invTotal;
	}

	@Column(name = "INV_STATUS", nullable = false)
	public boolean isInvStatus() {
		return this.invStatus;
	}

	public void setInvStatus(boolean invStatus) {
		this.invStatus = invStatus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "invoices")
	public Set<InvoiceDetails> getInvoiceDetailses() {
		return this.invoiceDetailses;
	}

	public void setInvoiceDetailses(Set<InvoiceDetails> invoiceDetailses) {
		this.invoiceDetailses = invoiceDetailses;
	}

}
