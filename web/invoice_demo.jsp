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
				</div>
			</div>
			<!-- /. ROW  -->
			<hr />
			<div class="row">
				<div class="col-md-12">
					<!-- Advanced Tables -->
					<div class="panel panel-default">
						<center>
							<s:form action="invoice_demo.html" method="get">
								<label>Tạo hóa đơn</label>
								<s:textfield name="invoices.invId" label="Mã hóa đơn"></s:textfield>
								<s:textfield name="invoices.account.accId" label="ID nhân viên"></s:textfield>
								<s:textfield name="invoices.invDate" label="Ngày tạo hóa đơn"></s:textfield>
								<s:textfield name="invoices.customer" label="Tên khách hàng"></s:textfield>
								<s:textfield name="invoices.invTotal" label="Tổng tiền"
									value="0" readonly="true"></s:textfield>
								<s:textfield name="invoices.invStatus"
									label="Trạng thái hóa đơn" value="false" readonly="true"></s:textfield>
								<s:submit value="Tạo hóa đơn" align="center"
									onclick="return confirm('Xác nhận tạo hóa đơn?')">
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