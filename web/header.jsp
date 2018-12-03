<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<head>
      <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Free Bootstrap Admin Template : Binary Admin</title>
	<!-- BOOTSTRAP STYLES-->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
     <!-- FONTAWESOME STYLES-->
    <link href='<s:url value="/assets/css/font-awesome.css" ></s:url>'  rel="stylesheet" />
     <!-- MORRIS CHART STYLES-->
    <link href='<s:url value="/assets/js/morris/morris-0.4.3.min.css" ></s:url>' rel="stylesheet" />
        <!-- CUSTOM STYLES-->
    <link href='<s:url value="/assets/css/custom.css" ></s:url>' rel="stylesheet" type="text/css" />
     <!-- GOOGLE FONTS-->
   <link href='<s:url value="http://fonts.googleapis.com/css?family=Open+Sans" ></s:url>' rel='stylesheet' type='text/css' />
</head>
<body>
    <div id="wrapper">
        <nav class="navbar navbar-default navbar-cls-top " role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html">Tiệm thuốc</a> 
            </div>
  <div style="color: white;
padding: 15px 50px 5px 50px;
float: right;
font-size: 16px;"> Chào mừng: ${sessionScope.fullname } <s:a action="logout.html" class="btn btn-danger square-btn-adjust">Đăng xuất</s:a></div>
        </nav>   