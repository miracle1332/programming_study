<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	session.setAttribute("name", "박지성");
    	application.setAttribute("address", "서울시 영등포구");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스코프 테스트</title>
</head>
<body>
	<h2>이름과 주소를 저장합니다.</h2>
	<a href ="appTest2.jsp">두번째 웹페이지로 이동</a>
</body>
</html>