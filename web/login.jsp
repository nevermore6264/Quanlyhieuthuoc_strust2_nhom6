<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Application</title>
</head>
<body>
	<center style="padding-top: 150px;">
		<center
			style="border: groove; height: 150px; width: 300px; padding-top: 20px; background: #F8F8F8;">
			<s:actionerror />
			<s:form action="process-Login" method="post">
				<table>
					<tr>
						<td><s:textfield name="username" label="Tên tài khoản" /></td>
					</tr>
					<tr>
						<td><s:password name="password" label="Mật khẩu" /></td>
					</tr>
					<tr>
						<td><input type="submit" value="Login"></td>
					</tr>
				</table>
			</s:form>
		</center>
	</center>
</body>
</html>