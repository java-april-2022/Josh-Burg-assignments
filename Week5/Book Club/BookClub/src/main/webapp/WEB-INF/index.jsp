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
<title>Login And Registration</title>
</head>
<body>

<h1>Book Club!</h1>
<p>A place for friends to share thoughts on books.</p>

<form:form action="/register" method="post" modelAttribute="newUser">

	<table>
		<thead>
	    	<tr>
	            <td>Register</td>
	        </tr>
	    </thead>
	    <thead>
	    	<tr>
	            <td>User Name:</td>
	            <td>
	            	<form:errors path="userName"/>
					<form:input path="userName"/>
	            </td>
	        </tr>
	        <tr>
	            <td>Email:</td>
	            <td>
	            	<form:errors path="email"/>
					<form:input path="email"/>
	            </td>
	        </tr>
	        <tr>
	            <td>Password:</td>
	            <td>
	            	<form:errors path="password"/>
					<form:input type= "password" path="password"/>
	            </td>
	        </tr>
	        <tr>
	            <td>Confirm Password:</td>
	            <td>
	            	<form:errors path="confirm" />
					<form:input type= "password" path="confirm"/>
	            </td>
	        </tr>
	        <tr>
	        	<td><input type="submit" value="Submit"/></td>
	        </tr>
	    </thead>
	</table>
</form:form>
<hr>
<form:form action="/login" method="post" modelAttribute="newLogin">

	<table>
		<thead>
	    	<tr>
	            <td>Log In</td>
	        </tr>
	    </thead>
	    <thead>
	        <tr>
	            <td>Email:</td>
	            <td>
	            	<form:errors path="email"/>
					<form:input path="email"/>
	            </td>
	        </tr>
	        <tr>
	            <td>Password:</td>
	            <td>
	            	<form:errors path="password"/>
					<form:input type= "password" path="password"/>
	            </td>
	        </tr>
	        <tr>
	        	<td><input type="submit" value="Submit"/></td>
	        </tr>
	    </thead>
	</table>
</form:form>
</body>
</html>