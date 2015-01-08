<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body >
<h1><i>Your Question posted successfully.</i></h1>
<% Integer output=(Integer)request.getAttribute("QuestionId"); %>
<% if(output==-1) {%>
<h1>Question not posted !!!</h1>
<%} else { %>
<%= "<h2><font color=\"blue\"> Your Question ID:  "+output +"</font></h2>"%>
<% } %>
</body>
</html>