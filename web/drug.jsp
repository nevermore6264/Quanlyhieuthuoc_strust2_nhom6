<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
                <div class="row">
                    <div class="col-md-12">
                     <h2>Quản lý thuốc</h2>   
                       
                       
                    </div>
                </div>
                 <!-- /. ROW  -->
                 <hr />
               
            <div class="row">
                <div class="col-md-12">
                    <!-- Advanced Tables -->
                    <div class="panel panel-default">
                        <div class="panel-heading">
                             <button>Thêm</button>
                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
                                            <th>Mã thuốc</th>
                                            <th>Tên</th>
                                            <th>Hàm lượng(mg)</th>
                                            <th>Đơn vị</th>
                                            <th>Hoạt chất</th>
                                            <th>Hướng dẫn dùng</th>
                                            <th>Hạn sử dụng</th>
                                            <th>Giá nhập</th>
                                            <th>Giá bán</th>
                                            <th>Số lượng</th>
                                            <th>Nhà sản xuất</th>
                                            <th>Tùy chọn</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr class="odd gradeX">
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td><a href="insert.jsp">Sửa</a></td>
                                            
                                    </tbody>
                                </table>
                            </div>
                            
                        </div>
                    </div>
                    <!--End Advanced Tables -->
                </div>
            </div>
                                  
                <!-- /. ROW  -->
               
    </div>
             <!-- /. PAGE INNER  -->
            </div>
            

 <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>