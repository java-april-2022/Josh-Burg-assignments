<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/style.css">
<title>New Show</title>
</head>
<body>
<div class="in-line">

</div>
<h1>Create a New TV Show!</h1>

<form:form action="/addShow" method="post" modelAttribute="show">

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
</form:form>

</body>
</html>