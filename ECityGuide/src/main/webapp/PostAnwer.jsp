
<html>
<head>
<title> Answer Form </title>

<script language = "javascript">

	function validate() {

	var qid = document.forms["form"]["qid"].value;
	if (qid == null || qid == ""){
		alert("Please enter the question ID");
		return false;
	}
	
	if(isNaN(qid)){
		alert("Enter proper question Id");
		return false;
	}
	var gid = document.forms["form"]["gid"].value;
	if (gid == null || gid == ""){
		alert("Please enter the guide ID");
		return false;
	}
	if(isNaN(gid)){
		alert("Enter proper Guide Id");
		return false;
	}


	var a = document.form.answer.value;
	if(a==""){
	alert("Please Enter Your answer");
	document.form.answer.focus();
	return false;
	}
		
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


<body>
<div id="header">

 
 <div id="top ">

<a href="userhome.jsp" target="_self"><b>Home</b>
  </a>
  </div>

<form method="POST" action="PostAnswerController"name="form" onsubmit="return validate()">

    
    <table border ="1" align="center" cellpadding="20">

        
        <tr>
            
            <td><strong>Question Id:</strong></td>

            
            <td>
                
                <input type="text" name="qid"/>
            </td>
            
        </tr>
	
	<tr>
            
            <td><strong>Guide Id:</strong></td>

            
            <td>
               
                <input type="text" name="gid"/>
            </td>
           
        </tr>


	<tr>
	   
	   <td><strong> Your Answer: </strong></td>

	   
	   <td>
		
		<textarea name="answer" cols="80" rows="4"></textarea>
	   </td>
	   
	</tr>

        <tr align="center">

            <td>
                
                <input type="submit" value="submit">
            </td>

            <td>
                
                <input type="reset">
            </td>
        </tr>

      
    </table>

    
</form>
</body>
</html>