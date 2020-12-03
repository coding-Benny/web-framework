<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수강신청 완료</title>
</head>
<body>
<h3>수강신청 완료</h3>
${course.className}이(가) 정상적으로 신청되었습니다.

<a href="${ pageContext.request.contextPath }/viewRegistration"> 수강 신청 내역 조회하기 </a>
</body>
</html>