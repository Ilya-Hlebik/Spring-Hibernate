<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<tittle>luv2code Company home Page</tittle>
</head>
<body>
	<h2>luv2code Company home Page - Yoohoo - Silly Goose!</h2>
	<hr>
	<p>Welcome to the luv2code company home page!</p>

	<form:form action="${pageContext.request.contextPath}/logout"
		method="post">
		<input type="submit" value="Logout" />
	</form:form>
</body>
</html>