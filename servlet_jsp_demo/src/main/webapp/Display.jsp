<%@page import="dto.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	//User user = (User) request.getAttribute("key");
	//List<User> list = (List) request.getAttribute("key");
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
			<th>PASSWORD</th>
		</tr>
		
		<tr>
		<%  for(User user : list){%>
		
		<td><%=user.getUserId() %></td>
		<td><%=user.getUserId()%></td>
			<td><%=user.getUserName()%></td>
			<td><%=user.getUserAge()%></td>
			<td><%=user.getUserAddress()%></td>
			<td><%=user.getUserPhone()%></td>
			<td><%=user.getUserEmail()%></td>
			<td><%=user.getUserPassword()%></td>
		
		</tr>
		<% } %>
		
	</table>
</body>
</html>