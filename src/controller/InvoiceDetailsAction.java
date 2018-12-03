package controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import entities.Drug;
import entities.InvoiceDetails;
import entities.Invoices;
import model.DrugModel;
import model.InvoiceDetailsModel;

public class InvoiceDetailsAction extends ActionSupport implements SessionAware, ServletRequestAware{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	InvoiceDetailsModel invoiceDetailsModel = new InvoiceDetailsModel();
	InvoiceDetails invoiceDetails;
	List<InvoiceDetails> listdetail = new ArrayList<>();
	private List<Drug> listthuoc = new ArrayList<>();
	private String name;
	Drug drug;
	Invoices invoices;
	private Integer num;
	private BigDecimal pri;
	private String drugId;
	private String invId;
	@SuppressWarnings("unused")
	private Map<String, Object> session;
	private HttpServletRequest request;
	private List<InvoiceDetails> total;







	

	public List<InvoiceDetails> getTotal() {
		return total;
	}

	public void setTotal(List<InvoiceDetails> total) {
		this.total = total;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private DrugModel drugModel = new DrugModel();

	public List<Drug> getListthuoc() {
		return listthuoc;
	}

	public void setListthuoc(List<Drug> listthuoc) {
		this.listthuoc = listthuoc;
	}

	public InvoiceDetails getInvoiceDetails() {
		return invoiceDetails;
	}

	public void setInvoiceDetails(InvoiceDetails invoiceDetails) {
		this.invoiceDetails = invoiceDetails;
	}

	

	public String getInvId() {
		return invId;
	}

	public void setInvId(String invId) {
		this.invId = invId;
	}

	

	public String getDrugId() {
		return drugId;
	}

	public void setDrugId(String drugId) {
		this.drugId = drugId;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public BigDecimal getPri() {
		return pri;
	}

	public void setPri(BigDecimal pri) {
		this.pri = pri;
	}

	public InvoiceDetailsModel getInvoiceDetailsModel() {
		return invoiceDetailsModel;
	}

	public void setInvoiceDetailsModel(InvoiceDetailsModel invoiceDetailsModel) {
		this.invoiceDetailsModel = invoiceDetailsModel;
	}

	public Drug getDrug() {
		return drug;
	}

	public void setDrug(Drug drug) {
		this.drug = drug;
	}

	public Invoices getInvoices() {
		return invoices;
	}

	public void setInvoices(Invoices invoices) {
		this.invoices = invoices;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<InvoiceDetails> getListdetail() {
		return listdetail;
	}

	public void setListdetail(List<InvoiceDetails> listdetail) {
		this.listdetail = listdetail;
	}

	public String listdemo3() {
		
		this.invId=this.request.getSession().getId();
		System.out.println("session :"+this.request.getSession().getAttribute("id"));
		String invocesid = String.valueOf(this.request.getSession().getAttribute("id"));
		this.listdetail = invoiceDetailsModel.searchDetails(invocesid);
		System.out.println("list:" + this.listdetail);
//		List<BigDecimal> list2 = new ArrayList<>();
//		list2=invoiceDetailsModel.searchDetailsT(invocesid);
//		System.out.println("list2:"+list2);
		this.total=invoiceDetailsModel.searchDetailsT(invocesid);
		System.out.println("this total:"+this.total);
		return SUCCESS;
	}

	public String addinvde() {
		System.out.println("Start add");
		boolean isCheck = invoiceDetailsModel.f(this.invoiceDetails);
		System.out.println(isCheck);
		if (isCheck) {
			System.out.println("SUCCESS" + this.invoiceDetails);
			return SUCCESS;
		}
		System.out.println("ERROR");
		return ERROR;
	}

	
	//exercute
	public String execute() {
		this.drug=drugModel.getDrugById(this.drugId);
		System.out.println(this.drugId);
		this.pri=this.drug.getPriceHr();
		return SUCCESS;
	}

	// search
	public String showdemo2() {
		this.listthuoc = drugModel.getDrug();
		return SUCCESS;
	}

	public String searchindemo2() {
		if (this.name.trim().equals("")) {
			this.listthuoc = drugModel.getDrug();
			return "all";
		} else {
			this.listthuoc = drugModel.searchDrugByName(this.name);
			return SUCCESS;
		}
	}
	
	public String deldrug(){
		this.drug=drugModel.getDrugById(this.drugId);
		Boolean ischeck = drugModel.delete(this.drug);
		if(ischeck){
			return SUCCESS;
		}
		return INPUT;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;

	}

}