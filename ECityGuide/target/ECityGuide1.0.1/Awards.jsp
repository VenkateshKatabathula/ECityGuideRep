<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Awards Page</title>
</head>
<body>
<p align="right"><a href="guidehome.jsp">Home</a> </p>
<% ResultSet rs = (ResultSet)(request.getAttribute("Result"));; 
%>
<% out.println("<table>");
out.println("<tr>");
out.println("<th>"+"Guide Id"+"</th>");
out.println("<th>"+"Amount"+"</th>");
out.println("</tr>");%>
<% while(rs.next()) { %>

<% out.println("<tr>");%>
	<td><%=rs.getInt(1)%></td>
	<td><%=rs.getInt(2)%></td> 
	<% out.println("</tr>");%>
	<%    }%>
<%out.println("</table>");%>

</body>
</html>