<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Confirmation</title>
</head>
<body>
	<p>${customer.custName} <br>
	   ${customer.custEmail} <br>
	   ${customer.plan} <br>
	   ${customer.gender }
	</p>
	<ul>
		<c:forEach var="item" items= "${customer.terms}">
		<li>${item}</li>
		</c:forEach>
	</ul>
</body>
</html>