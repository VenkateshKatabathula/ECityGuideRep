<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Questions</title>
<script language = "javascript">

function verify()
{
	if(document.viewquestions.city.value=="")
	{
		alert("Enter city");
		return false;
	}
	
	
	return true;
}

</script>
<style>
body
{
     background-image: url("img22.jpg");
     background-repeat: no-repeat;
     background-size:cover;
    }
    </style>
</head>
<body  target="_top">
<div id="header">

 
 <div id="top ">

  &nbsp&nbsp&nbsp&nbsp&nbsp<a href="guidehome.jsp" target="_self"><b>Home</b>&nbsp&nbsp&nbsp&nbsp&nbsp
  </a>
  </div>
  
 <form method="post" action="ViewQuestionController" name="viewquestions">
 <table align="center">
 <tr>
 <td></td><td><Strong>My Questions</Strong></td> </tr>
 <tr><td><Strong>Enter City Name:</Strong></td> 
 <td><input type="text" name="city"></td>
 </tr>
 <tr><td></td>
 <td><input type="submit" value="submit" onClick="return verify()"></td>
 </table>
 </form>
</body>
</html>