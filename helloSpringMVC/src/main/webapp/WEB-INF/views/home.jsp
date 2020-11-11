<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<title>Home</title>
</head>
<body>
	<p> <a href="${ pageContext.request.contextPath }/offers"> Show current offers</a> </p>
	<p> <a href="${ pageContext.request.contextPath }/createOffer"> Add a new offer</a> </p>
</body>
</html>
