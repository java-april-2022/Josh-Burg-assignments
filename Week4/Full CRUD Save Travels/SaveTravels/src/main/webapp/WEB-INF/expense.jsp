<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Edits</title>
<meta charset="UTF-8">
<title>Expense</title>
</head>
<body>

	<div class= "container">
	
		<h1>Expense Details</h1>
		<a href="/">Go Back</a>
		
		<table>
			<tr>
				<th>Expense Details:</th>
				<td><c:out value="${expense.name}"></c:out></td>
			</tr>
			<tr>
				<th>Expense Description:</th>
				<td><c:out value="${expense.description}"></c:out></td>
			</tr>
			<tr>
				<th>Vendor:</th>
				<td><c:out value="${expense.vendor}"></c:out></td>
			</tr>
			<tr>
				<th>Amount Spent:</th>
				<td><c:out value="${expense.amount}"></c:out></td>
			</tr>
		</table>
		
	</div>
	
</body>
</html>