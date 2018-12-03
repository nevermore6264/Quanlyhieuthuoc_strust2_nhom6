<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<jsp:include page="nav_left.jsp"></jsp:include>
	<div id="page-wrapper">
		<div id="page-inner">
			
				<center>
					<div id="chechau2"
					style="float: left; width: 490px; height: 420px; margin-left:300px; padding: 30px 0px 0px 80px; background-color: orange;">
					<s:form action="process-addnew.html" method="post">
					<s:textfield label="Tên tài khoản" name="account.username"></s:textfield>
					<s:textfield label="Tên người dùng" name="account.name"></s:textfield>
					<s:password label="Mật khẩu" name="account.password"></s:password>
					<s:password label="Nhập lại mật khẩu" name="cfmpassword"></s:password>
					<s:textfield label="Ngày sinh" name="account.birthday"></s:textfield>
					<s:select label="Giới tính" name="account.gender"
						list="#{'true':'Nam', 'false':'Nữ'}"></s:select>
					<s:select label="Quyền hạn" name="account.roles"
						list="#{'true':'Admin', 'false':'Nhân viên'}"></s:select>
					<s:select label="Trạng thái" name="account.accStatus"
						list="#{'true':'Mở', 'false':'Đóng'}"></s:select>
						<s:submit value="Tạo tài khoản" align="center" onclick="return confirm('Bạn thực sự muốn tạo?')"></s:submit>
						</s:form>
				</div>
				</center>
				
				


			
		</div>
	</div>
	<center></center>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>