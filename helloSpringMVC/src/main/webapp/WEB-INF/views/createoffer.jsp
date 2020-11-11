<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${ pageContext.request.contextPath }/resources/css/main.css" >
</head>
<body>
	<form method="post" action="${ pageContext.request.contextPath }/docreate">
		<table class="formtable">
			<tr><td class="label">Name</td><td><input class="control" type="text" name="name" /></td></tr>
			<tr><td class="label">Email</td><td><input class="control" type="text" name="email" /></td></tr>
			<tr><td class="label">Offer</td><td><textarea class="control" name="text" rows="10" cols="10"></textarea></td></tr>
			<tr><td></td><td><input type="submit" value="새 제안" /></td></tr>
		</table>
	</form>
</body>
</html>