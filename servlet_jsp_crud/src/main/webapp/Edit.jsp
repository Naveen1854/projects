<%@ page import="dto.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Page</title>
</head>
<body>

	<%
    User user = (User) request.getAttribute("key");
	%>

	<form action="updated" method="post">
	
		ID:<input type="hidden" placeholder="Enter userId" name="id" value="<%=user.getUserId()%>">
		<br> <br> 
		Name: <input type="text" placeholder="Enter the username" name="name" value="<%=user.getUserName()%>"> 
		<br> <br> 
		Age: <input type="number" placeholder="Enter the Age" name="age" value="<%=user.getUserAge()%>"> 
		<br> <br> 
		Address: <input type="text" placeholder="Enter the Address" name="address" value="<%=user.getUserAddress()%>"> 
		<br> <br> 
		Phone: <input type="tel" placeholder="Enter the phoneNo"  name="phone" value="<%=user.getUserPhone()%>"> 
		<br> <br> 
		Email: <input type="email" placeholder="Enter thte Email" readonly="readonly" name="email" value="<%=user.getUserEmail()%>"> 
		<br> <br>
		Password: <input type="password" placeholder="Enter the password" name="password" value="<%=user.getUserPassword()%>"> 
		<br> <br>
		<button>UPDATE</button>
	</form>

</body>
</html>