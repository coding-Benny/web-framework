<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Success</title>
</head>
<body>
	<h1>You registered successfully.</h1>
	<ul>
		<li>Id: ${customer.id}
		<li>Password: ${customer.password}
		<li>Gender: ${customer.gender}
		<li>Name: ${customer.name}
		<li>Email: ${customer.email}
	</ul>
	<p>
		<a href="/hw1-helloMVC/index.jsp"> go to home page </a>
	</p>
</body>
</html>