<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Awards page</title>
<script language = "javascript">

function verify()
{
	
	if(document.awardsform.guideId.value=="")
	{
		alert("Enter guide Id");
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
<h1>Awards Page</h1>
<body>
<div id="header">

 
 <div id="top ">

  &nbsp&nbsp&nbsp&nbsp&nbsp<a href="guidehome.jsp" target="_self"><b>Home</b>&nbsp&nbsp&nbsp&nbsp&nbsp
  </a>
  </div>
<form action="ViewAwardsController" method="post" name="awardsform">
Guide Id&nbsp;&nbsp;&nbsp;&nbsp;<input type = "text" name="guideId"><br>
 <input type="submit" name="submit" value="submit" onClick="return (verify())">
</form>

</body>
</html>
