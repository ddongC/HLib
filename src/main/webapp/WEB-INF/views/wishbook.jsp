<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- input값이 controller로 전송이안됨 -->
	<!-- 이거 떔에 안됨 -->
	 <form method="post" action="sendBookData" >
		Book Title : <input type="text" name="bookname"/>
		Author : <input type="text" name="author"/>
		<input type="submit" value="SendData" /><br />
	</form>
	
</body>
</html>