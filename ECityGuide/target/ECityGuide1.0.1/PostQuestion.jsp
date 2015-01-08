
<html>
<head>
<title> Question Form </title>
<h1 align=center>Question Page</h1>
<script language = "javascript">



function verify()
{
	if(document.form.city.value=="")
	{
		alert("Enter city");
		return false;
	}
	if(document.form.question.value=="")
	{
		alert("Enter Question");
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


<body  >

<div id="top ">

  &nbsp&nbsp&nbsp&nbsp&nbsp<a href="userhome.jsp" target="_self"><b>Home</b>&nbsp&nbsp&nbsp&nbsp&nbsp
  </a>
  </div>
<form method="POST" action="PostQuestionController"  name=form onsubmit="return verify()">

    <table  align="center" > 
        <tr>
          
            <td><strong>City:</strong></td>
            <td>
         
                <input type="text" name="city"/>
            </td>
           
        </tr>
	
	<tr>
	  
	   <td><strong> Your Question: </strong></td> <td>
		<textarea name="question" cols="50" rows="4"></textarea>
	   </td>
	   
	</tr>
    </table>   

    <p align="center"  >      
    <input type="submit" value="submit" >
     </p>
        
</form>
</body>
</html>