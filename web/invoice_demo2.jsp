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
						<div class="panel-heading">

							<s:form action="searchdemo2.html" method="post">
								<label>Nhập tên thuốc </label>
								<s:textfield name="name"></s:textfield>
								<s:submit value="Search" align="left"></s:submit>
							</s:form>
						</div>

						<div class="panel-body">
							<div class="table-responsive">
								<s:form action="invoice_demo3.html" method="get">
									<s:a label="Mã hóa đơn">${sessionScope.id}</s:a>
									<s:textfield value="%{#session.id}"></s:textfield>
									<display:table name="listthuoc"
										class="table table-striped table-bordered table-hover"
										id="dataTables-example" pagesize="10" cellpadding="2px;"
										cellspacing="2px;" requestURI="">
										<display:column property="drugId" title="ID"></display:column>
										<display:column property="drugName" title="Drug's name"
											sortable="true"></display:column>
										<display:column property="manufacturer" title="Hãng"></display:column>
										<display:column property="drugContent" title="Hàm lượng"></display:column>
										<display:column property="drugUnit" title="Đơn vị"></display:column>
										<display:column property="drugIngredients" title="Hàm lượng"></display:column>
										<display:column property="priceHr" title="Giá"></display:column>
										<display:column property="quantity" title="Số lượng"></display:column>
										<display:column title="Thao tác" value="Mua"
											href="invoice_add.html" paramId="drugId"
											paramProperty="drugId" />
									</display:table>
								</s:form>
							</div>
						</div>
						<div></div>
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