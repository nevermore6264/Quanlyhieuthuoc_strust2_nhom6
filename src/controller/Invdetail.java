package controller;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import entities.Drug;
import entities.InvoiceDetails;
import entities.Invoices;
import model.InvoiceDetailsModel;

public class Invdetail extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	InvoiceDetails invoiceDetails;
	Drug drug;
	Invoices invoices;
	InvoiceDetailsModel invoicesModel = new InvoiceDetailsModel();
	List<InvoiceDetails> lcc = new ArrayList<>();
	
	public List<InvoiceDetails> getLcc() {
		return lcc;
	}

	public void setLcc(List<InvoiceDetails> lcc) {
		this.lcc = lcc;
	}

	public InvoiceDetails getInvoiceDetails() {
		return invoiceDetails;
	}

	public void setInvoiceDetails(InvoiceDetails invoiceDetails) {
		this.invoiceDetails = invoiceDetails;
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

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}
	
	public String show(){
		boolean isCheck = invoicesModel.f(this.invoiceDetails);
		if(isCheck){
			System.out.println(this.invoiceDetails);
			this.lcc=invoicesModel.searchDetails();
			System.out.println("dm3:"+this.lcc);
			return SUCCESS;
			
		}
		return INPUT;
	}
}
