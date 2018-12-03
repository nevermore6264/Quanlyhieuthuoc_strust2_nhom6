<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<jsp:include page="nav_left2.jsp"></jsp:include>
	<div id="page-wrapper">
		<center>
			<div id="page-inner">
				<center>
					<div id="chechau2"
						style="float: left; width: 490px; height: 500px; margin-left: 300px; padding: 30px 0px 0px 80px; background-color: pink;">
						<s:form action="up.html" method="post">
							<s:textfield label="ID" name="drug.drugId"></s:textfield>
							<s:textfield label="TÊN THUỐC" name="drug.drugName"></s:textfield>
							<s:textfield label="HÀM LƯỢNG" name="drug.drugContent"></s:textfield>
							<s:select label="ĐƠN VỊ" name="drug.drugUnit" list="listunit"
								headerKey="-1" headerValue="Chọn đơn vị">
							</s:select>
							<s:textfield label="THÀNH PHẦN" name="drug.drugIngredients"></s:textfield>
							<s:date name="drug.timeExpired" var="timeExpired"
								format="dd-MM-yyyy" />
							<s:textfield label="HẠN SỬ DỤNG" name="timeExpired"></s:textfield>
							<s:textarea label="HƯỚNG DẪN SỬ DỤNG" name="drug.guide"></s:textarea>
							<s:textfield label="GIÁ GỐC" name="drug.priceNr"></s:textfield>
							<s:textfield label="GIÁ BÁN" name="drug.priceHr"></s:textfield>
							<s:textfield label="SỐ LƯỢNG" name="drug.quantity"></s:textfield>
							<s:textfield label="HÃNG SẢN XUẤT" name="drug.manufacturer">
							</s:textfield>

							<s:submit align="center" value="Sửa"
								onclick="return confirm('bạn có muốn thêm loại thuốc này?')"></s:submit>

						</s:form>
					</div>
				</center>

			</div>
		</center>

	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>