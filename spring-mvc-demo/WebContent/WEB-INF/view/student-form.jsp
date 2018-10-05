<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Student Registratin Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		First name: <form:input path="firstName" />
		</br>
		Last name: <form:input path="lastName" />
		</br>

		</br>
		Country :
		
		<form:select path="country">
			<form:options items="${student.countryOptions}" />
		</form:select>
		</br>
		<%-- 	Java <form:radiobutton path=""/> --%>
		
		Favorite Language:
		Java <form:radiobutton path="favoriteLanguage" value="Java" />
		C# <form:radiobutton path="favoriteLanguage" value="C#" />
		PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
		Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />

		</br>
		Operating Systems:
		
		Linux <form:checkbox path="operatingSystems" value="Linux"/>
		Mac Os <form:checkbox path="operatingSystems" value="MAC OS"/>
		MS Windows <form:checkbox path="operatingSystems" value="MS Windows"/>
		</br>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>