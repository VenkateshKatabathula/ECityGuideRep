<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Payments</title>
</head>
<body>
 <% ResultSet rs = (ResultSet) request.getAttribute("resultset"); %>
 <%ResultSet rs1=(ResultSet) request.getAttribute("resultset1"); %>
<h1>Payments Recieved</h1>
<% out.println("<table>");%>
<tr><td>UserId</td><td>Amount</td></tr>

 <%while (rs.next())
	{%>
	<%="<tr>"%>
	<%="<td>"+rs.getString(1)+"</td>"%>
	<%="<td>"+rs.getInt(2)+"</td>"%>
	<%out.println("</tr>");%>
    <%    }%>
<% out.println("</table>");%>
<% out.println("<table>");%>
<tr><td>GuideId</td><td>Amount</td></tr>
 <%while (rs1.next())
	{%>
	<%="<tr>"%>
	<%="<td>"+rs1.getString(1)+"</td>"%>
	<%="<td>"+rs1.getInt(2)+"</td>"%>
	<%out.println("</tr>");%>
    <%    }%>
<% out.println("</table>");%>
 
</body>
</html>