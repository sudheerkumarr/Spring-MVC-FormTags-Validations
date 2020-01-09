<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<style>
	.error {
		color: red;
	}
</style>
</head>
<body>
	<form:form action="process-form" modelAttribute="customer">
		<label>FullName * </label><br>
		<form:input path="custName" />
		<form:errors path="custName" cssClass="error" />     
        <br><br>  
        <label>Email </label><br>
        <form:input type="email" path="custEmail" />  
        <br><br>
        <label>Gender</label><br>
        <label>Male</label>
        <form:radiobutton path="gender" value="male"/>
        <label>Female</label>
        <form:radiobutton path="gender" value="female"/>
        <br><br>
        <label>Choose Plan: </label>
        <form:select path="plan">
        	<form:option value="gold" label="Gold"/>
        	<form:option value="silver" label="Silver"/>
        	<form:option value="bronze" label="Bronze"/>
        </form:select>
        <br><br>
        <form:checkbox path="terms" value="subscribe for latest updates"/>
         <label>Subscribe for latest updates</label><br>
        <form:checkbox path="terms" value="agree terms and conditions"/>
         <label>I Agree Terms and Conditions</label><br><br>
        <input type="submit" value="Submit" />
        
	</form:form>
</body>
</html>
