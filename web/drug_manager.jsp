<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="display" uri="http://displaytag.sf.net"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Quản lý Thuốc</title>

</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<jsp:include page="nav_left2.jsp"></jsp:include>
	<div id="page-wrapper">
		<div id="page-inner">
			<div class="row">
				<div class="col-md-12">
					<h2>Quản lý Thuốc</h2>
				</div>
			</div>
			<!-- /. ROW  -->
			<hr />
			<div class="row">
				<div class="col-md-12">
					<!-- Advanced Tables -->
					<div class="panel panel-default">
						<div class="panel-heading">
							<s:a href="drug_insert.html"><button>Thêm mới</button></s:a>
						</div>
						
						<div class="panel-heading">
							<s:form action="searchmng.html" method="post">
								<s:textfield name="drugName" label="Tên Thuốc"></s:textfield>
								<s:submit value="Tìm kiếm" align="left"></s:submit>
							</s:form>
						</div>
						<div class="panel-body">
							<div class="table-responsive">
								<display:table name="lsDrugs"
									class="table table-striped table-bordered table-hover"
									id="dataTables-example" pagesize="10" cellpadding="2px;"
									cellspacing="2px;" requestURI="">
									<display:column property="drugId" title="Mã"></display:column>
									<display:column property="drugName" title="Tên thuốc"
										sortable="true"></display:column>
									<display:column property="priceHr" title="Giá gốc"></display:column>
									<display:column property="priceNr" title="Giá bán	"></display:column>
									<display:column property="manufacturer" title="Hãng"></display:column>
									<display:column property="drugContent" title="Hàm lượng"></display:column>
									<display:column property="drugUnit" title="Đơn vị"></display:column>
									<display:column property="drugIngredients" title="Thành phần"></display:column>
									<display:column property="guide" title="Hướng dẫn sử dụng"></display:column>
									<display:column property="timeExpired" title="Hạn sử dụng"
										format="{0,date,dd/MM/yyyy}"></display:column>
									<display:column property="quantity" title="Số lượng"></display:column>
									<display:column title="UPDATE" value="Update"
										href="drugupdate.html" paramId="drugId" paramProperty="drugId" />
								</display:table>
							</div>
						</div>
					</div>
					<!--End Advanced Tables -->
					
				</div>

				<!-- /. ROW  -->
				<div id="fuckcolumn"></div>
			</div>
			<!-- /. PAGE INNER  -->
		</div>


		<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>