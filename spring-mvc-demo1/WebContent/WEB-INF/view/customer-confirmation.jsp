<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>customer confirmation</title>
</head>
<body>
	First name: ${customer.firstName} ${customer.lastName}
	<br><br>
	passes: ${customer.passes}
	<br><br>
	postal code: ${customer.postalCode}
	<br><br>
	course code: ${customer.courseCode}
	<br><br>
	email: ${customer.email}
</body>
</html>