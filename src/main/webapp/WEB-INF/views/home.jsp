<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
   <title>Home</title>
   <style type="text/css"> 
table{

border : 3px solid block;
}
</style>
</head>
<body>
<center><h1><br><br><table width="100%" >
<tr>
<td align="center">
<img src="http://www.kmug.co.kr/board/data/logo/1265092579/111.jpg" border="0"><h1>도서관 시스템 </h1></td>
</tr>
</table>
<h2>Hlib</h2></center>

<center><table border=3 width=50%>
<tr><td width="100" height="60" align=center>
<br>
<P> <a href="/LibraryManager/printgrade"> 회원 등급 조회하기 </a></P>
<P> <a href="/LibraryManager/printpoint"> 회원 포인트 조회하기 </a></P>
<P> <a href="/LibraryManager/wishbook"> 희망 도서 신청하기 </a></P>
<P> <a href="/LibraryManager/inputreturninfo"> 도서 반납하기  </a></P>
<br></tr></td>

</table></center>
</body>
</html>
