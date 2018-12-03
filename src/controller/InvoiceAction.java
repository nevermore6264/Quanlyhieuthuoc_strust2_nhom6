package controller;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import entities.Account;
import entities.Drug;
import entities.InvoiceDetails;
import entities.Invoices;
import model.DrugModel;
import model.InvoiceDetailsModel;
import model.InvoiceModel;

public class InvoiceAction extends ActionSupport {
	Invoices invoices;
	private String invId;
	private Account account;
	private Date invDate;
	private String customer;

	private BigDecimal invTotal;
	private boolean invStatus;
	private HttpServletRequest request;
	InvoiceModel invoiceModel = new InvoiceModel();
	private List<Drug> listthuoc = new ArrayList<>();
	private DrugModel drugModel = new DrugModel();
	
	public List<Drug> getListthuoc() {
		return listthuoc;
	}

	public void setListthuoc(List<Drug> listthuoc) {
		this.listthuoc = listthuoc;
	}

	private int accId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private String id;

	public Invoices getInvoices() {
		return invoices;
	}

	public void setInvoices(Invoices invoices) {
		this.invoices = invoices;
	}

	public String getInvId() {
		return invId;
	}

	public void setInvId(String invId) {
		this.invId = invId;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Date getInvDate() {
		return invDate;
	}

	public void setInvDate(Date invDate) {
		this.invDate = invDate;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public BigDecimal getInvTotal() {
		return invTotal;
	}

	public void setInvTotal(BigDecimal invTotal) {
		this.invTotal = invTotal;
	}

	public boolean isInvStatus() {
		return invStatus;
	}

	public void setInvStatus(boolean invStatus) {
		this.invStatus = invStatus;
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public InvoiceModel getInvoiceModel() {
		return invoiceModel;
	}

	public void setInvoiceModel(InvoiceModel invoiceModel) {
		this.invoiceModel = invoiceModel;
	}

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	public String display() {
		return SUCCESS;
	}
//// processAddnew
	public String processAddNew() {
		boolean isCheck = invoiceModel.addNew(this.invoices);
		System.out.println(isCheck);
		if (isCheck) {
			System.out.println("SUCCESS" + this.invoices.getInvId());
			this.listthuoc = drugModel.getDrug();
			Map<String, Object> session2 = ActionContext.getContext().getSession();
			session2.put("id", this.invoices.getInvId());
			return SUCCESS;
		}
		System.out.println("error");
		return ERROR;
	}

	////////////////////////////////////////////////////////////////
	private InvoiceDetailsModel DetailsModel = new InvoiceDetailsModel();

	private List<InvoiceDetails> lstDetails = new ArrayList<>();
	InvoiceDetails invoiceDetails = new InvoiceDetails();

	public InvoiceDetails getInvoiceDetails() {
		return invoiceDetails;
	}

	public void setInvoiceDetails(InvoiceDetails invoiceDetails) {
		this.invoiceDetails = invoiceDetails;
	}

	public InvoiceDetailsModel getDetailsModel() {
		return DetailsModel;
	}

	public void setDetailsModel(InvoiceDetailsModel detailsModel) {
		DetailsModel = detailsModel;
	}

	public List<InvoiceDetails> getLstDetails() {
		return lstDetails;
	}

	public void setLstDetails(List<InvoiceDetails> lstDetails) {
		this.lstDetails = lstDetails;
	}

	public Drug getDrug() {
		return drug;
	}

	public void setDrug(Drug drug) {
		this.drug = drug;
	}

	private Drug drug = new Drug();

	private String drugId;
	private int number;
	private BigDecimal price;

	public String getDrugId() {
		return drugId;
	}

	public void setDrugId(String drugId) {
		this.drugId = drugId;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
//////add hdct
//	public String processAddhdct() {
//		boolean isCheck = DetailsModel.addDrug(this.invoiceDetails);
//		if (isCheck) {
//			return SUCCESS;
//		}
//		System.out.println("error");
//		return ERROR;
//	}
	public String Details() throws Exception {
		this.lstDetails = DetailsModel.searchDetails(this.id);
		System.out.println(this.id);
		return SUCCESS;
	}
}
