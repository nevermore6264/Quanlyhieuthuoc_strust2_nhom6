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
<s:form>
	<table>
		<td><s:textfield label="Tên thuốc"></s:textfield></td>
		<td><s:textfield label="Hàm lượng(mg)"></s:textfield></td>
		<td><s:textfield label="Đơn vị(nhỏ)"></s:textfield></td>
		<td><s:textfield label="Giá_lẻ "></s:textfield></td>
		<td><s:textfield label="Đơn vị(lớn)"></s:textfield></td>
		<td><s:textfield label="Giá_lẻ(lớn)"></s:textfield></td>
		<td><s:textarea label="Hướng dẫn sử dụng"></s:textarea> </td>
		<td><s:date name="date" /></td>
		<td><s:textfield label="Giá" ></s:textfield> </td>
		<td><s:textfield label="Số lượng"></s:textfield> </td>
		<td><s:textfield label="NSX"></s:textfield> </td>
		<td><s:submit value="Thêm"></s:submit> </td>
	</table>
</s:form>
</body>
</html>