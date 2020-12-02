<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>2018-1 수강 내역</title>
<link rel="stylesheet" type="text/css" href="${ pageContext.request.contextPath }/resources/css/summary.css">
<link rel="stylesheet" type="text/css" href="${ pageContext.request.contextPath }/resources/css/detail.css">
</head>
<body>
	<h3>2018-1 수강 내역</h3>
	<table class="table" border="1">
		<thead>
			<tr><th>년도</th><th>학기</th><th>교과목명</th><th>교과구분</th><th>담당교수</th><th>학점</th></tr>
		</thead>
		<tbody>
			<c:forEach var="course" items="${ courses }">
				<tr>
					<td><c:out value="${ course.year }"></c:out></td>
					<td><c:out value="${ course.semester }"></c:out></td>
					<td class="className"><c:out value="${ course.className }"></c:out></td>
					<td class="classifcation"><c:out value="${ course.classification }"></c:out></td>
					<td class="professor"><c:out value="${ course.professor }"></c:out></td>
					<td><c:out value="${ course.credits }"></c:out></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>