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
					<div>
						<s:textfield name="id" label="Mã hóa đơn" value="%{#session.id}"
							readonly="true"></s:textfield>
						<div class="panel-body">
							<div class="table-responsive">
								<display:table name="listdetail"
									class="table table-striped table-bordered table-hover"
									id="dataTables-example" pagesize="10" cellpadding="2px;"
									cellspacing="2px;" requestURI="">
									<display:column property="invoices.invId" title="Mã hóa đơn"></display:column>
									<display:column property="drug.drugId" title="Mã Thuốc"></display:column>
									<display:column property="numberDetail" title="Số lượng"></display:column>
									<display:column property="xxx" title="Tổng tiền"></display:column>
									<display:column title="Thao tác" value="Xóa" href="delete.html" paramName="drugId" paramProperty="drugId">
									</display:column>
								</display:table>
							</div>
							<s:textfield label="TỔNG TIỀN" value="%{total}"></s:textfield>
						</div>
					</div>
					<div>
						<button>
							<s:a href="invoice_demo2.html">Quay lại chọn sản phẩm</s:a>
						</button>
						<button>
							<s:a>Xác nhận hóa đơn</s:a>
						</button>
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