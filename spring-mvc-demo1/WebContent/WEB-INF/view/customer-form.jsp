<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer form</title>
<style>
	.error {color:red})
</style>
</head>
<body>
	<form:form action="processForm" modelAttribute="customer">
		FirstName: <form:input path="firstName" />
		<br><br>
		LastName*: <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />
		<br><br>
		<input type="submit"/>
	</form:form>
</body>
</html>