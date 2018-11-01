<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		
	</head>

	<body>
		<center>	
						<c:url var="loginUrl" value="/login" />
						<form action="${loginUrl}" method="post" >
							<c:if test="${param.error != null}">
								<div >
									<p>Invalid username and password.</p>
								</div>
							</c:if>
							<c:if test="${param.logout != null}">
								<div>
									<p>You have been logged out successfully.</p>
								</div>
							</c:if>
							<div>
								<i>USERNAME : </i>
								<input type="text" name="userName" placeholder="Enter Username" required>
							</div>
							<div>
								<i>PASSWORD : </i> 
								<input type="password" name="password" placeholder="Enter Password" required>
							</div>
							
								
							<div>
								<input type="submit" value="Log in">
							</div>
						</form>
					</center>
	</body>
</html>