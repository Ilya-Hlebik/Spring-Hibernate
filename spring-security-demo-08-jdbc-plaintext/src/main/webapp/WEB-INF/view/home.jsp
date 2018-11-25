<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>

<html>
<head>
<tittle>luv2code Company home Page</tittle>
</head>
<body> 
	<h2>luv2code Company home Page - Yoohoo - Silly Goose!</h2>
	<hr>
	<p>Welcome to the luv2code company home page!</p>

	<hr>
	<p>
		
		User: <security:authentication property="principal.username" />
		<br>
		<br> 
		Role(s): <security:authentication property="principal.authorities" />
	</p>

	<security:authorize access="hasRole('MANAGER')"  >
		<p>
			<a href="${pageContext.request.contextPath}/leaders">LeaderShip
				Meeting</a> (Only for Manager peeps)
		</p>
	</security:authorize>
	<security:authorize access="hasRole('ADMIN')"  >
		<p>
			<a href="${pageContext.request.contextPath}/systems">It Systems Meeting</a> (Only for Admin peeps)
		</p>
	</security:authorize>
	<hr>
	<form:form action="${pageContext.request.contextPath}/logout"
		method="post">
		<input type="submit" value="Logout" />
	</form:form>
</body>
</html>