<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Answer</title>
<script language = "javascript">

function verify()
{
	
	if(document.answerform.questionId.value=="")
	{
		alert("Enter QuestionId");
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

<body >
 <div id="header">

 
 <div id="top ">

  &nbsp&nbsp&nbsp&nbsp&nbsp<a href="userhome.jsp" target="_self"><b>Home</b>&nbsp&nbsp&nbsp&nbsp&nbsp
  </a>
  </div>
<form action="ViewAnswerController" method="post" name="answerform">
<h4>Question Id:</h4><input type="text" name="questionId"></br></br>
<input type="submit" value="submit" onClick="return (verify())"/>
</form>
</body>
</html>