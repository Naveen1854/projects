<%@page import="dto.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display</title>
</head>
<body>

	<%
	//User user = (User) request.getAttribute("key");
	List<User> list = (List) request.getAttribute("key");
	%>

	<table border="2px solid black" rules="all">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>AGE</th>
			<th>ADDRESS</th>
			<th>PHONE</th>
			<th>EMAIL</th>
			<th>PASSWORD</th>
			<th>DELETE</th>
			<th>UPDATE</th>
		</tr>
		<%  
// Retrieve the logged-in user from the session
User loggedInUser = (User) session.getAttribute("loggedInUser");

if (loggedInUser != null) {
%>
<tr>
<td><%=loggedInUser.getUserId() %></td>
<td><%=loggedInUser.getUserName() %></td>
<td><%=loggedInUser.getUserAge() %></td>
<td><%=loggedInUser.getUserAddress() %></td>
<td><%=loggedInUser.getUserPhone() %></td>
<td><%=loggedInUser.getUserEmail() %></td>
<td><%=loggedInUser.getUserPassword() %></td>
<td><a href="delete?id=<%=loggedInUser.getUserId()%>"><button class="delete-btn">DELETE</button></a></td>
<td><a href="update?id=<%=loggedInUser.getUserId()%>"><button class="update-btn">UPDATE</button></a></td>
</tr>

</table>
<% 
} 
%>
	</table>
</body>
</html>