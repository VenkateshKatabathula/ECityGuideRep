<%@page import="java.sql.ResultSet"%>
<%@page import="com.ecg.beans.QuestionBean,javax.servlet.http.HttpSession" %>
<%@ page language="java" contentType="text/html;;charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Questions</title>
</head>
<body>
<p align="right"><a href="guidehome.jsp">Home</a> </p>
<%
ResultSet rs= (ResultSet)(session.getAttribute("Result")); 
%>
<% out.println("<table>");
out.println("<tr>");
out.println("<td>"+"Question Id"+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>");
out.println("<td>"+"Question"+"</td>");
out.println("</tr>");%>
<% while (rs.next()){%>
	
	<td><%=rs.getInt(1)%><td>
	<%=rs.getString(2)%> 
	<%out.println("</tr>");%>
    <% }%>
<% out.println("</table>");%>

</body>
</html>