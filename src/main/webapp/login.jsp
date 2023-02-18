<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${msg}
     <h1 style="color: green">Welcome to Login Page</h1>
	<form action="login" method="post">
		<table>
		<center>
			<tr>
				<th>Email/Phone:</th>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<th>Password:</th>
				<td><input type="text" name="password"></td>
			</tr>
			<tr>
				<td><button type="reset">Cancel</button><td>
				<button>Login</button>
			</tr>
			</center>
		</table>
		
	</form>
	<br>
	<a href="load">New? Click here to SignUp </a>
     

</body>
</html>