<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<center><h2> 희망 도서 신청 페이지입니다. </h2><br>

<table >
<tr><td >
<img src="http://www.medicompr.co.kr/medicompr/content_image/notice/742092C4-B5A9-4972-84C6-EAA556DA26FB.jpg" border="0">
</td></tr>

</table>
<p><h4>도서명과 저자를 입력해주세요</p></h4>
   <!-- input값이 controller로 전송이안됨 -->
   <!-- 이거 떔에 안됨 -->
    <form method="post" action="sendBookData" >
      도서명 : <input type="text" name="bookname"/><br>
  &nbsp; 저자 &nbsp;&nbsp;: <input type="text" name="author"/><br>
      <input type="submit" value="SendData" /><br>
   </form>
   
</body>
</html>