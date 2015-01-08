
<html>
<head>
<title> Feedback Form </title>

<script language = "javascript">


function verify()
{
	if(document.form.guideId.value=="")
	{
		alert("Enter guide Id");
		return false;
	}
	if(document.form.questionId.value=="")
	{
		alert("Enter QuestionId");
		return false;
	}
	if(document.form.rating.selectedIndex==0){
		 alert("Please select rating");
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



<h1 align="center"><i>Feedback Form</i></h1>
<div id="header">

 
 <div id="top ">

  &nbsp&nbsp&nbsp&nbsp&nbsp<a href="userhome.jsp" target="_self"><b>Home</b>&nbsp&nbsp&nbsp&nbsp&nbsp
  </a>
  </div>
<form method="POST" action="FeedbackController" name="form" >

   
    <table align="center" >

        
	
	<tr>
        <td>
        	<strong>Guide Id:</strong>
        </td>
           
         <td>
             <input type="text" name="guideId"/>
           </td>
           
        </tr>

	
        <tr>
            
            <td><strong>Question Id:</strong></td>

          
            <td>
               
                <input type="text" name="questionId"/>
            </td>
           
        </tr>


	<tr>
	  
	   <td><strong> Your Rating: </strong></td>

	 
	   <td>
		
		<select name="rating">
		<option value = "Select">Select</option>
		<option value = "Not Ok">Not Ok</option>
		<option value = "Ok">Ok</option>
		<option value = "Good">Good</option>
		<option value = "Better">Better</option>
		<option value = "Best">Best</option>
		</select>
	   </td>
	 
	</tr>

        <tr align="center">

            <td>
               
                <input type="submit" value="submit" onClick="return (verify())">
            </td>

            <td>
               
                <input type="reset">
            </td>
        </tr>

        
    </table>

    
</form>
</body>
</html>