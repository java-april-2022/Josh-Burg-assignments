<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/style.css">
<title>The Show</title>
</head>
<body>

	<div class= "container">
	
		<h1><c:out value="${show.title}"></c:out></h1>
		<a href="/shows">Back to Dashboard</a>
		
		<table>
			<tr>
				<th>Posted By:</th>
				<td><c:out value="${user.userName}"></c:out></td>
			</tr>
			<tr>
				<th>Network:</th>
				<td><c:out value="${show.network}"></c:out></td>
			</tr>
			<tr>
				<th>Description:</th>
				<td><c:out value="${show.description}"></c:out></td>
			</tr>

		</table>
		
	</div>
	<button class= "button"><a href="/shows/edit/${show.id}">Edit</a></button>
</body>
</html>