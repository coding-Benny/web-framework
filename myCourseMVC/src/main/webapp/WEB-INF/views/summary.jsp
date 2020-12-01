<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학년/학기별 이수 학점 조회</title>
<link rel="stylesheet" type="text/css" href="${ pageContext.request.contextPath }/resources/css/summary.css">
</head>
<body>
	<h3>학년/학기별 이수 총 학점</h3>
	<table class="table" border="1">
		<thead>
			<tr><th>년도</th><th>학기</th><th>취득 학점</th><th>상세보기</th></tr>
		</thead>
		<tfoot>
			<tr><th>총계</th><th></th><th><c:out value="${ totalCredits }"></c:out></th><th></th></tr>
		</tfoot>
		<tbody>
			<c:forEach var="summary" items="${ summaries }">
				<tr>
					<td><c:out value="${ summary.year }"></c:out></td>
					<td><c:out value="${ summary.semester }"></c:out></td>
					<td><c:out value="${ summary.credits }"></c:out></td>
					<td><a href="${ pageContext.request.contextPath }/details/${ summary.year }-${summary.semester}">링크</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>