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
<title>Login And Reg</title>
</head>
<body>
<div>
	<h1>Welcome, <c:out value="${user.userName}"></c:out>!</h1>
	<h3>Books from everyones shelves:</h3>
		<p><a href="/logout">logout</a></p>
		<p><a href="/add">Add to my shelf</a></p>

		<table>
			<tr>
				<th>ID</th>
				<th>Title</th>
				<th>Author Name</th>
				<th>Posted By</th>
			</tr>
			<c:forEach var = "book" items = "${book}">
			<tr>
				<td><c:out value = "${book.id}"/></td>
 				<td><a href="books/${book.id}"><c:out value="${book.title}"/></a></td>
				<td><c:out value = "${book.author}"/></td>
				<td><c:out value = "${book.user.userName}"/></td>
			</tr>
			</c:forEach>
				
		</table>
	</div>
</body>
</html>