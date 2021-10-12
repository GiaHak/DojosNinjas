<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
<!-- for Bootstrap CSS -->
	<link rel="stylesheet"
	href="/webjars/bootstrap/5.0.1/css/bootstrap.min.css" />

	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="/css/main.css"/>
	<!-- For any Bootstrap that uses JS or jQuery-->
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/5.0.1/js/bootstrap.min.js"></script>
	<title>Insert title here</title>
</head>
<body>
	<h1><c:out value= "${dojos.name }"></c:out> Location Ninjas</h1>
	<table>
	<tr>
	<th>First Name</th>
	<th>Last Name</th>
	<th>Age</th>
	</tr>
	<c:forEach var="x" items="${dojos.ninjas }">
	<tr>
	<th><c:out value="${x.firstName }"></c:out></th>
	<th><c:out value="${x.lastName }"></c:out></th>
	<th><c:out value="${x.age }"></c:out></th>
	</tr>
	</c:forEach>
	
	
	</table>

</body>
</html>
