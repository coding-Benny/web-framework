<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Page</title>
</head>
<style>
div.ex {
	text-align: center;
	width: 35%;
	padding: 10px;
	border: 5px solid grey;
	margin: 0px
}

table { padding: 5px; }
th { font-size: 1.3em; }
td { padding: 5px; }
	
.category { width: 30%; }
.user-info { width: 50%; }
</style>
<body>
	<h1>Registration Form</h1>
	<div class="ex">
		<form action="/hw1-helloMVC/doRegister" method="post">
			<table>
				<tr>
					<th colspan="2">Enter Information Here</th>
				</tr>
				<tr>
					<td class="category">아이디</td>
					<td class="user-info"><input type="text" name="id" /></td>
				</tr>
				<tr>
					<td class="category">비밀번호</td>
					<td class="user-info"><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td class="category">이름</td>
					<td class="user-info"><input type="text" name="name" /></td>
				</tr>
				<tr>
					<td class="category">성별</td>
					<td class="user-info">
					<input type="radio" name="gender" value="male" /> 남자
					<input type="radio" name="gender" value="female" /> 여자
					</td>
				</tr>
				<tr>
					<td class="category">이메일</td>
					<td class="user-info"><input type="email" name="email" /></td>
				</tr>
				<tr>
					<td class="category"></td>
					<td class="user-info"><input type="submit" value="register" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
