<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Successful Login !</title>
</head>
<body>
<h4>Welcome </h4>
<table>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Date of Birth</th>
<th>SSN</th>
</tr>
<c:forEach items="${customers}" var="customer" varStatus="index">
<tr>
<td>${customer.firstName}</td>
<td>${customer.lastName}</td>
<td>${customer.dateofBirth}</td>
<td>${customer.ssn}</td>
</tr>
</c:forEach>
</table>
</body>
</html>