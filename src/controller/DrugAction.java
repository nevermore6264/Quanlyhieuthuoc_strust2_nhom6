package controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.validation.SkipValidation;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

import entities.Drug;
import model.DrugModel;

public class DrugAction extends ActionSupport implements ServletRequestAware, Preparable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private HttpServletRequest request;

	private DrugModel DrugModel = new DrugModel();

	private List<Drug> lsDrugs = new ArrayList<>();
	private List<String> listunit;

	

	

	public List<String> getListunit() {
		return listunit;
	}

	public void setListunit(List<String> listunit) {
		this.listunit = listunit;
	}

	private Drug drug = new Drug();

	private String drugId;
	private String drugName;
	private String drugContent;
	private String drugUnit;
	private String drugIngredients;
	private String guide;
	private String timeExpired;
	private BigDecimal priceNr;
	private BigDecimal priceHr;
	private int quantity;
	private String manufacturer;

	public DrugModel getDrugModel() {
		return DrugModel;
	}

	public void setDrugModel(DrugModel drugModel) {
		this.DrugModel = drugModel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public String getDrugId() {
		return drugId;
	}

	public void setDrugId(String drugId) {
		this.drugId = drugId;
	}

	public String getDrugName() {
		return drugName;
	}

	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	public String getDrugContent() {
		return drugContent;
	}

	public void setDrugContent(String drugContent) {
		this.drugContent = drugContent;
	}

	public String getDrugUnit() {
		return drugUnit;
	}

	public void setDrugUnit(String drugUnit) {
		this.drugUnit = drugUnit;
	}

	public String getDrugIngredients() {
		return drugIngredients;
	}

	public void setDrugIngredients(String drugIngredients) {
		this.drugIngredients = drugIngredients;
	}

	public String getGuide() {
		return guide;
	}

	public void setGuide(String guide) {
		this.guide = guide;
	}

	

	public String getTimeExpired() {
		return timeExpired;
	}

	public void setTimeExpired(String timeExpired) {
		this.timeExpired = timeExpired;
	}

	public BigDecimal getPriceNr() {
		return priceNr;
	}

	public void setPriceNr(BigDecimal priceNr) {
		this.priceNr = priceNr;
	}

	public BigDecimal getPriceHr() {
		return priceHr;
	}

	public void setPriceHr(BigDecimal priceHr) {
		this.priceHr = priceHr;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public List<Drug> getLsDrugs() {
		return lsDrugs;
	}

	public void setLsDrugs(List<Drug> lsDrugs) {
		this.lsDrugs = lsDrugs;
	}

	public Drug getDrug() {
		return drug;
	}

	public void setDrug(Drug drug) {
		this.drug = drug;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	@SkipValidation
	@Override
	public String execute() throws Exception {
		this.lsDrugs = DrugModel.getDrug();
		System.out.println("DrugAction return"+lsDrugs);
		
		//danh sách đơn vị thuốc
//		listunit = new ArrayList<String>();
//		listunit.add("Viên");
//		listunit.add("Vỉ");
//		listunit.add("Hộp");
		return SUCCESS;
	}
	
	
	

	@SkipValidation
	// search
	public String searchDrug() throws Exception {
		this.lsDrugs = DrugModel.getDrug();
		return SUCCESS;
	}

	
	
	@SkipValidation
	public String searchD() throws Exception {
		if (this.drugName.trim().equals("")) {
			this.lsDrugs = DrugModel.getDrug();
			return "all";
		} else {
			this.lsDrugs = DrugModel.searchDrugByName(this.drugName);
			return SUCCESS;
		}
	}
	
	@SkipValidation
	public String update() throws Exception {
		this.drug = DrugModel.getDrugById(this.drugId);
		return SUCCESS;
	}

	@SkipValidation
	public String processUpdate() throws Exception {
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		Date birthDate = format.parse(this.timeExpired);
		java.sql.Date birthSQL = new java.sql.Date(birthDate.getTime());
		this.drug.setTimeExpired(birthSQL);
		boolean isCheck = DrugModel.update(this.drug);
		if (isCheck) {
			this.lsDrugs = DrugModel.getDrug();
			return SUCCESS;
		}
		request.setAttribute("message", "Update is unsuccessful!");
		return ERROR;
	}
	
	@SkipValidation
	public String drugadd(){
		return SUCCESS;
	}
	
	public String processdrugadd() throws Exception {
		
		boolean isCheck = DrugModel.addNew(this.drug);
		if (isCheck) {
			this.lsDrugs = DrugModel.getDrug();
			return SUCCESS;
		}
		request.setAttribute("message", "Add new is unsuccessful!");
		return ERROR;
	}

	@SkipValidation
	@Override
	public void prepare() throws Exception {
		//danh sách đơn vị thuốc
				listunit = new ArrayList<String>();
				listunit.add("Viên");
				listunit.add("Vỉ");
				listunit.add("Hộp");
		
	}

	
}
