<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGIN PAGE</title>
</head>
<body>
	<style>
		.error {color: red}
	</style>
	<h3>LOGIN PAGE</h3>
	<form:form action="success" modelAttribute="login">
		User Name <span class="error">(*)</span>: <form:input path="userName" />
		<form:errors path="userName" cssClass="error" />

		<br><br>
		
		Password<span class="error">(*)</span>: <form:password path="passWord" />
		<form:errors path="passWord" cssClass="error" />

		<br><br>
		
		<input type="submit" value="Submit" /><span><br><br><input type="reset" value="Reset" /></span>
		
	</form:form>
</body>
</html>