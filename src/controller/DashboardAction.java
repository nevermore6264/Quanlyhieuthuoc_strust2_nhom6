package controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import entities.Account;
import entities.Invoices;
import model.DashboardModel;

public class DashboardAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String year,day,month;
	private String frmDate,enDate;
	private int accId;
	Invoices invoices = new Invoices();
	Account account = new Account();

	public Invoices getInvoices() {
		return invoices;
	}

	public void setInvoices(Invoices invoices) {
		this.invoices = invoices;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public String getFrmDate() {
		return frmDate;
	}

	public void setFrmDate(String frmDate) {
		this.frmDate = frmDate;
	}

	public String getEnDate() {
		return enDate;
	}

	public void setEnDate(String enDate) {
		this.enDate = enDate;
	}

	DashboardModel dashboardModel = new DashboardModel();
	List<Invoices> listinv = new  ArrayList<>();
	
	public DashboardModel getDashboardModel() {
		return dashboardModel;
	}

	public void setDashboardModel(DashboardModel dashboardModel) {
		this.dashboardModel = dashboardModel;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public List<Invoices> getListinv() {
		return listinv;
	}

	public void setListinv(List<Invoices> listinv) {
		this.listinv = listinv;
	}

	@Override
	public String execute() throws Exception {
		this.listinv = dashboardModel.getInvoices();
		System.out.println(this.listinv);
		return SUCCESS;
	}
	
	public String listbydate(){
		this.listinv = dashboardModel.getInvoices();
		return SUCCESS;
	}
	
	public String listbymoney(){
		this.listinv=dashboardModel.getInvoicesMoney();
		System.out.println(this.listinv);
		return SUCCESS;
	}
	
	public String listbyaccid(){
		
		if(this.accId==0){
			this.listinv = dashboardModel.getInvoices();
		}else{
			this.listinv=dashboardModel.getInvoicesByaccId(this.accId);
		}
		return SUCCESS;
	}
}
