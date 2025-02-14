<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>SignUp</title>
</head>
<body>
	<form action="signup">
		<h1>Register</h1>
		<label for="userName">UserName: </label><input type="text" id="name"
			placeholder="Enter Your Name" name="name" required="required"><br>
		<br> <label for="age">Age: </label><input type="number" id="age"
			placeholder="Enter Your Age" name="age" required="required"><br>
		<br> <label for="address">Address: </label><input type="text"
			id="address" placeholder="Enter Your Address" name="address"><br>
		<br> <label for="phone">Phone: </label><input type="tel" id="phone"
			placeholder="Enter Your PhoneNo" name="phone" required><br>
		<br> <label for="email">Email: </label><input type="email"
			id="email" placeholder="Enter Your Email" name="email" required><br>
		<br> <label for="password">Password: </label><input
			type="password" id="password" placeholder="Enter Your Password"
			name="password" required><br>
		<br>
		<button type="submit">Signup</button>
	</form>
</body>
</html>