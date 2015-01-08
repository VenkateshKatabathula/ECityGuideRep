<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Status</title>

</head>
<body>
<% Integer output=(Integer)request.getAttribute("registrationId"); %>
<% if(output==-1) {%>
<h1>Registration Failed !!!</h1>
<%} else { %>
<h1>Registration Sucessfull !!!</h1>
<%= "<h2><font color=\"blue\"> Your User ID:  "+output +"</font></h2>"%>
<% } %>
<% out.print("CLick Login to continue"); %>>
<a href="Login.jsp">Click To Login</a>

</body>
</html>







