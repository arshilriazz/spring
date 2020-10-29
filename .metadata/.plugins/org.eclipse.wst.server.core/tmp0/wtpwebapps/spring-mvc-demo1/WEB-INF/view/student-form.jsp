<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student registration form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">
		FirstName: <form:input path="firstName" />
		<br><br>
		LastName: <form:input path="lastName" />
		<br><br>
		<form:select path="country" >
			<form:options items="${student.countryOptions}"/>
		</form:select>
		<br><br>
		Java: <form:radiobutton path="favoriteLanguage" value="Java"/>
		PHP: <form:radiobutton path="favoriteLanguage" value="PHP"/>
		<input type="submit"/>
	</form:form>

</body>
</html>