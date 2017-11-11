<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">


<link rel="stylesheet" href="${initParam.rootPath }/resource/bootstrap/css/demo.css">
<link rel="stylesheet" href="${initParam.rootPath }/resource/bootstrap/css/material-dashboard.css">  
<link rel="stylesheet" href="${initParam.rootPath }/resource/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="${initParam.rootPath }/resource/bootstrap/css/reset.css">
<link rel="stylesheet" href="${initParam.rootPath }/resource/bootstrap/css/style.css">
<link rel="stylesheet" href="${initParam.rootPath }/resource/css/background_style.css">

 <script src="${initParam.rootPath }/resource/bootstrap/js/jquery-3.1.0.min.js"></script>
 <script src="${initParam.rootPath }/resource/bootstrap/js/demo.js"></script>
 <script src="${initParam.rootPath }/resource/bootstrap/js/material.min.js"></script>
  <script src="${initParam.rootPath }/resource/bootstrap/js/material-dashboard.js"></script> 
 <script src="${initParam.rootPath }/resource/bootstrap/js/bootstrap.min.js"></script>
 <script src="${initParam.rootPath }/resource/bootstrap/js/jquery.menu-aim.js"></script>
 <script src="${initParam.rootPath }/resource/bootstrap/js/main.js"></script>
 <script src="${initParam.rootPath }/resource/bootstrap/js/modernizr.js"></script>

<c:if test="${sessionScope.message != null}">
	<script>alert('${sessionScope.message}')</script>
	<c:remove scope="session" var="message"/>
</c:if>


<title>Insert title here</title>
<style type="text/css">
.whole {
	height: 600px;
	margin-top: 100px;
}
.side, .content{
	height:100%;
	padding: 0px;
	back-ground:yellow;
}


@media screen and (max-width: 750px){ /*화면이 웹 스크린이고 width가 750px 이하가 되면*/
	.side, .whole {
		height: auto;
	}
}


</style>
</head>
<body>

<div >
	
	<header >
	
	    <tiles:insertAttribute name="head"/>
	    
	</header> 
	<%--메인 body --%> <!-- style=background-color:#E6E6E6; -->
	<section class="row content" >
		<%-- 메뉴 --%>
		<nav class="col-sm-2 ">
			<tiles:insertAttribute name="menu"/>
		</nav>
		<!-- 내용 -->
		
		<div  class="col-sm-10 " style="padding-top:75px;" >
			<tiles:insertAttribute name="content"/>
		</div>
		
	</section>
</div>

</body>

</html>