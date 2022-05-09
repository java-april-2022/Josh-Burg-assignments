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
	<meta charset="UTF-8">
<meta charset="UTF-8">
<title>Book Info</title>
</head>
<body>
	<body>

	<div>
		<h1>Welcome, <c:out value="${user.userName}"/></h1>
		
		<h3>Books from everyone shelves:</h3>
		<a href="/logout">logout</a>
		<a href="/addPage">+ Add to my shelf</a>
		<a href="/home">Home</a>
		
		<div>
			<h3><c:out value="${book.user.userName}"/>read 
			<c:out value="${book.title}"/> by 
			<c:out value="${book.author}"/></h3>
		</div>
		
		<div>
			<h4>Here are their thoughts:</h4>
			<hr />
			
			<p><c:out value="${book.thoughts}"/></p>
			<hr />
		
		</div>
		
	</div>

</body>


</body>
</html>