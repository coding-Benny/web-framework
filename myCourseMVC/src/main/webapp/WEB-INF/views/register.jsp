<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<% request.setCharacterEncoding("UTF-8"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수강신청</title>
<link rel="stylesheet" type="text/css" href="${ pageContext.request.contextPath }/resources/css/register.css">
</head>
<body>
	<h3>2021-1 수강신청</h3>
	<sf:form method="post"
		action="${ pageContext.request.contextPath }/doRegister"
		modelAttribute="course"
		acceptCharset="UTF-8">
		<table class="formtable">
			<sf:input class="control" type="hidden" value="2021" path="year" />
			<sf:input class="control" type="hidden" value="1" path="semester" />
			<tr>
				<td class="label">교과목명</td>
				<td><sf:input class="control" type="text" path="className" /><br/>
					<sf:errors path="className" class="error" /> </td>
			</tr>
			<tr>
				<td class="label">교과구분</td>
				<td><sf:input class="control" type="text" path="classification" /><br/>
					<sf:errors path="classification" class="error" /></td>
			</tr>
			<tr>
				<td class="label">담당교수</td>
				<td><sf:input class="control" type="text" path="professor" /><br/>
					<sf:errors path="professor" class="error" /></td>
			</tr>
			<tr>
				<td class="label">학점</td>
				<td><sf:input class="control" type="text" value="" path="credits" /><br/>
					<sf:errors path="credits" class="error" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="수강신청" /></td>
			</tr>
		</table>
	</sf:form>
</body>
</html>