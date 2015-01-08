<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<script>
function verify(){
	if(document.form1.userId.value=="")
	{
		alert("Enter user Id");
		return false;
	}
	if(document.form1.password.value=="")
	{
		alert("Enter password");
		return false;
	}
	return true;
}

</script>
<body   onload="noBack();">

<h2 align="center"><i> Login Here</i></h1>
 <form action="LoginController" method="post"  target="_top" name="form1">
           
              <p align="center">
                       <Strong>UserId</Strong>&nbsp;&nbsp;&nbsp;&nbsp;
                 
                        <input type="text" name="userId" /><br>
                    
                       <Strong>Password</Strong>
                        <input type="password" name="password" /><br><br>
                   
                       <input type="submit" value="Login" onClick="return verify();"/>
                        <input type="reset" value="Reset" /><br>
                       
                </p>    

        </form>
  
</body >
</html>