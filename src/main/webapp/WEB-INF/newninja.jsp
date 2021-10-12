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
<h1>New Ninja</h1>
			<form:form action="/newninja" method="post" modelAttribute="ninja">
   			    <h2>
   			        <form:label  path="dojo">Dojo:</form:label>
   			    	<form:select  path="dojo">
   			    		<c:forEach items="${dojos}" var="x">
   			    			<form:option value="${x.id}"><c:out value="${x.name}"/></form:option>
		    			</c:forEach>
 			    	</form:select>
			    </h2>		  
			    <h2>
			        <form:label path="firstName">First Name:</form:label>
			        <form:input path="firstName"/>
			        <form:errors path="firstName"></form:errors>
			    </h2>
   			    <h2>
			        <form:label path="lastName">Last Name:</form:label>
			        <form:input  path="lastName"/>
			        <form:errors path= "lastName"></form:errors>
			        
			    </h2>
   			    <h2>
			        <form:label path="age">Age:</form:label>
			        <form:input  path="age"/>
			        <form:errors path= "age"></form:errors>
			    </h2>
			    <input id="btn" type="submit" value="Create"/>	 
			</form:form>
			

</body>
</html>
