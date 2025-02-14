<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="Login.css">
</head>
<body>
	<div class="container">
		<% String message = (String) request.getAttribute("key");
        if (message != null) { %>
		<h1><%= message %></h1>
		<% } %>

		<form action="login">
			<div class="form-group">
				<label for="email">Email:</label> <input type="email"
					placeholder="Enter Your Email" name="email" required>
			</div>
			<div class="form-group">
				<label for="pwd">Password:</label> <input type="password"
					placeholder="Enter Your Password" name="pwd" required>
			</div>
			<button type="submit">Login</button>
		</form>
	</div>
</body>
</html>
