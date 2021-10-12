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
			<h1>New Dojo</h1>
			<form:form action="/createDojo" method="post" modelAttribute="dojo">		  
			    <h2>
			        <form:label path="name">Name:</form:label>
			        <form:input path="name"/>
			    </h2>
			    <input id="btn" type="submit" value="Create"/>	 
			</form:form>
		
	
</body>
</html>
