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
<title>SHOWS!</title>
</head>
<body>
<div>
	<h1>Welcome, <c:out value="${user.userName}"></c:out>!</h1>
	<p><a href="/logout">logout</a></p>
	<h3>Tv Shows:</h3>


		<table>
			<tr>
				<th>ID</th>
				<th>Title</th>
				<th>Network</th>
<!-- 				<th>Average Rating?</th>
 -->			</tr>
			<c:forEach var = "show" items = "${show}">
			<tr>
				<td><c:out value = "${show.id}"/></td>
 				<td><a href="shows/${show.id}"><c:out value="${show.title}"/></a></td>
				<td><c:out value = "${show.network}"/></td>

			</tr>
			</c:forEach>
		
		</table>			
		<button class= "button"><a href="/show/new">Add a Show</a></button>
	</div>
</body>
