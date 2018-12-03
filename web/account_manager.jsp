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
<title>Quản lý tài khoản</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<jsp:include page="nav_left.jsp"></jsp:include>
	<div id="page-wrapper">
		<div id="page-inner">
			<div class="row">
				<div class="col-md-12">
					<h2>Quản lý Tài Khoản</h2>
				</div>
			</div>
			<!-- /. ROW  -->
			<hr />
			<div class="row">
				<div class="col-md-12">
					<!-- Advanced Tables -->
					<div class="panel panel-default">
						<div class="panel-heading">
							<s:a href="acc_add.html">Tạo tài khoản</s:a>
						</div>
						<div class="panel-heading">
							<s:form action="Accountsearch.html" method="post">
								<s:textfield name="name" label="Tên người dùng"></s:textfield>
								<s:submit value="Search" align="left"></s:submit>
							</s:form>
						</div>
						<div class="panel-body">
							<div class="table-responsive">
								<display:table name="requestScope. listacc"
									class="table table-striped table-bordered table-hover"
									id="dataTables-example" pagesize="10" cellpadding="2px;"
									cellspacing="2px;" requestURI="">
									<display:column property="accId" title="ID"></display:column>
									<display:column property="username" title="Tên tài khoản"
										sortable="true"></display:column>
									<display:column property="password" title="Mật khẩu"></display:column>
									<display:column property="name" title="Tên người dùng" sortable="true"></display:column>
									<display:column property="genders" title="Giới tính"></display:column>
									<display:column property="birthday" title="Ngày sinh"
										format="{0,date,dd/MM/yyyy}"></display:column>
									<display:column property="status" title="Trạng thái"
										sortable="true"></display:column>
									<display:column property="role" title="Quyền hạn" sortable="true"></display:column>
									<display:column title="UPDATE" value="Update"
										href="update.html" paramId="accId" paramProperty="accId" />




								</display:table>
								
							</div>

						</div>
					</div>
					<!--End Advanced Tables -->
				</div>
			</div>

			<!-- /. ROW  -->
			<div id="fuckcolumn"></div>
		</div>
		<!-- /. PAGE INNER  -->
	</div>


	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>