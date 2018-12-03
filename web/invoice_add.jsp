<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="display" uri="http://displaytag.sf.net"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="assets/css/function.css" rel="stylesheet" />
<title>Invoice</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<jsp:include page="nav_left2.jsp"></jsp:include>
	<div id="page-wrapper">
		<div id="page-inner">
			<div class="row">
				<div class="col-md-12">
					<h2>Chọn sản phẩm</h2>
						<s:iterator value="lcc">
							<s:property value="invoiceDetails.drug.drugId" />
						</s:iterator>
				</div>
			</div>
			<!-- /. ROW  -->
			<hr />
			<div class="row">
				<div class="col-md-12">
					<!-- Advanced Tables -->
					<div class="panel panel-default">
						<center>
							<s:form action="invdetails.html" method="get">
								<label>Nhập thông tin thuốc</label>
								<s:textfield name="invoiceDetails.invoices.invId" label="Mã hóa đơn" value="%{#session.id}"></s:textfield>
								<s:textfield name="invoiceDetails.drug.drugId" label="ID thuốc" value="%{drugId}"></s:textfield>
								<s:textfield name="invoiceDetails.numberDetail" label="Số lượng mua"></s:textfield>
								<s:textfield name="invoiceDetails.price" label="Giá thuốc" value="%{pri}"></s:textfield>
								<s:submit value="Thêm vào đơn" align="center"
									onclick="return confirm('Xác nhận lưu vào hóa đơn?')">
								</s:submit>
							</s:form>
							
						</center>
					</div>
					
					<!--End Advanced Tables -->
				</div>
			</div>
			<!-- /. ROW  -->
			<br>
			<h1>&nbsp;</h1>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>