<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<center><h2> 회원 등급 조회 화면입니다. </h2><br>
<table border=2 width=500>
<tr>
<br><td>
<img src="http://kinimage.naver.net/20160523_173/1463993955954yHXi5_PNG/%BB%F3%BB%F3%B7%C2.PNG?type=w620" border="0"></td>
<td  width="300">
<p>&nbsp;&nbsp;&nbsp;학번 : ${stdID} </p>
<p><h4>&nbsp;&nbsp;&nbsp;회원님의 등급은 <b>'${Grade}' </b> 입니다.</h4> </p></td>
<br></tr>

</table></center>
</body>
</html>