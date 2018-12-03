<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="display" uri="http://displaytag.sf.net"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <jsp:include page="header.jsp"></jsp:include>
 <jsp:include page="nav_left.jsp"></jsp:include>
 <div id="page-wrapper" >
            <div id="page-inner">
            <div class="panel-heading">
            	
            	<s:form action="Datenow.html" method="get" theme="simple">
            		<s:label>Nhập mã nhân viên:</s:label><s:textfield name="accId"></s:textfield>
            	<s:submit value="Tìm kiếm" ></s:submit>
            	</s:form>
            </div>
            <div class="panel-body">
							<div class="table-responsive">
								<display:table name="listinv" 
									class="table table-striped table-bordered table-hover"
									id="dataTables-example" pagesize="10" cellpadding="2px;"
									cellspacing="2px;" requestURI="">
									<display:column property="account.accId" title="Mã nhân viên"></display:column>
									<display:column property="invId" title="Mã hóa đơn"></display:column>
									<display:column property="customer" title="Khách hàng"></display:column>
									<display:column property="invDate" format="{0,date,dd/MM/yyyy}" sortable="true" title="Ngày tạo hóa đơn"></display:column>
									<display:column property="invTotal" title="Tổng tiền"></display:column>
								</display:table>
								
							</div>

						
						</div>
			
            </div>
        </div>
 <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>