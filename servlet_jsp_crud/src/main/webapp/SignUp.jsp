<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Signup</title>
<link rel="stylesheet" href="SignUp.css">
</head>
<body>
	<div class="container">
		<h1>Register</h1>
		<form action="signup">
			<div class="form-group">
				<label for="name">UserName:</label> <input type="text" id="name"
					placeholder="Enter Your Name" name="name" required>
			</div>
			<div class="form-group">
				<label for="age">Age:</label> <input type="number" id="age"
					placeholder="Enter Your Age" name="age" required>
			</div>
			<div class="form-group">
				<label for="address">Address:</label> <input type="text"
					id="address" placeholder="Enter Your Address" name="address"
					required>
			</div>
			<div class="form-group">
				<label for="phone">Phone:</label> <input type="tel" id="phone"
					placeholder="Enter Your PhoneNo" name="phone" required>
			</div>
			<div class="form-group">
				<label for="email">Email:</label> <input type="email" id="email"
					placeholder="Enter Your Email" name="email" required>
			</div>
			<div class="form-group">
				<label for="pwd">Password:</label> <input type="password" id="pwd"
					placeholder="Enter Your Password" name="pwd" required>
			</div>
			<button type="submit">REGISTER</button>
		</form>
	</div>
</body>
</html>
