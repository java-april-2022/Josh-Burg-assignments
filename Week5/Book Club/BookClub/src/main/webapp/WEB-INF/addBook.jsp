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
<title>Add a Book</title>


</head>
<body>
	<div class="container">

	<h1>Add to Your Book Shelf</h1>

	<a href="/dashboard">Back to Shelves</a>

	<div>
		<form:form action="/addBook" modelAttribute="book" method="post">
		
			<div>
			 	<form:errors path="title"/>
				<form:label for="title" path="title">Title:</form:label>
				<form:input type="text" path="title"/>
			</div>
			
			<div>
				<form:errors path="author" class="error"/>
				<form:label for="author" path="author">Author:</form:label>
				<form:input type="text" path="author"/>
			</div>
			
			<div>
				<form:errors path="thoughts" class="error"/>
				<form:label for="thoughts" path="thoughts">Thoughts:</form:label>
				<form:textarea path="thoughts"/>
			</div>
			
			<div>
				<form:errors path="user" class="error"/>
				<form:input type="hidden" path="user" value="${user.id}"/>
			</div>
			
			<div>
				<input type="submit" value="Submit"/>
			</div>
			
		</form:form>
	</div>



</div>
</body>
</html>