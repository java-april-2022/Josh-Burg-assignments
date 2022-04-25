<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />

<link rel="stylesheet" href="/css/index.css"/>
<title>Omikuji Project</title>
</head>
<body>
	<h1>Send an Omikuji!</h1>
	
	<form action="/formData" method= "post">
	<div>
		<label>Pick any number between 5 and 25</label><br/>
		<input type = "number" name = "number">
	</div>
	
	<div>
		<label>Enter the name of any city</label><br/>
		<input type = "text" name = "city">
	</div>
	
	<div>
		<label>Enter the name of any real person</label><br/>
		<input type = "text" name = "person">
	</div>
	
	<div>
		<label>Enter a professional endeavor or hobby</label><br/>
		<input type = "text" name = "hobby">
	</div>
	
	<div>
		<label>Enter any type of living thing </label><br/>
		<input type = "text" name = "thing">
	</div>
	
	<div>
		<label>Say something nice about someone:</label><br/>
		<textarea name = "statement" rows="10" cols="30"></textarea>
	</div>
	
	<div>
		<p> Send and show a friend!</p>
		<input type="submit" value = "Send">
	</div>
	
	</form>
</body>
</html>