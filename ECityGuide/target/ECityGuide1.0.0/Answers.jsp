<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p align="right"><a href="userhome.jsp">Home</a> </p>
<% ResultSet rs = (ResultSet)(request.getAttribute("Result")); %>
<% System.out.print(rs);%> 
<% out.println("<table>");
out.println("<tr>");
out.println("<td>"+"Answer Id"+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>");
out.println("<td>"+"Answer"+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>");
out.println("<td>"+"Question Id"+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>");
out.println("<td>"+"Guide Id"+"</td>");
out.println("</tr>"); %>
<% while(rs.next()) { %>
<%="<tr>"%>
<%="<td>"+rs.getString(1)+"</td>"%>
	<%="<td>"+rs.getString(2)+"</td>"%>
	<%="<td>"+rs.getString(3)+"</td>"%>
	<%="<td>"+rs.getString(4)+"</td>"%>
	
	<%out.println("</tr>");%>
    <%    }%>
<% out.println("</table>");%>

</body>
</html>