<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
if(session.getAttribute("fname")==null){
	response.sendRedirect("LoginPage.jsp");
}

%>
	<form action="">
		<table align="center">
			<tr>
				<td><h1>Welcome ${fname} ${lastname}</h1></td>
			</tr>
			<tr>
				<td>Click here to LogOut <a href="AftarLogout.jsp">LogOut</a></td>
			</tr>
		</table>
	</form>
</body>
</html>