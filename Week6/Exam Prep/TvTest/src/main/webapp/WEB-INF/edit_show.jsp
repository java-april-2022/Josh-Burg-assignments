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
<title>Edit Show</title>
</head>
<body>
<h1><c:out value = "${show.title}"/></h1>

<form:form action="/shows/edit/${show.id}" method="post" modelAttribute="show">
	<input type="hidden" name="_method" value="put">
	<form:input type="hidden" name="user" path="user"/>
	
	<table>
	    <thead>
	    	<tr>
	            <td class="float-left">Title:</td>
	            <td class="float-left">
	            	<form:errors path="title" class="text-danger"/>
					<form:input class="input" path="title"/>
	            </td>
	        </tr>
	        <tr>
	            <td class="float-left">Network:</td>
	            <td class="float-left">
	            	<form:errors path="network" class="text-danger"/>
					<form:input class="input" path="network"/>
	            </td>
	        </tr>        
	        <tr>
	            <td class="float-left">Description:</td>
	            <td class="float-left">
	            	<form:errors path="description" class="text-danger"/>
					<form:textarea rows="3" class="input" path="description"/>
	            </td>
	        </tr>   
	        <tr>
	        	<td colspan=2><input class="input" class="button" type="submit" value="Submit"/></td>
	        </tr>
	    </thead>
	</table>
		<button><a href="/shows">Cancel</a></button>
		
	<button class="delete"><a href="/shows/delete/${show.id}">Delete</a></button>

</form:form>

</body>
</html>