<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<html lang="en">
    <head> 
    	<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" type="text/css" href="assets/css/bootstrap.css">

		<!-- Website CSS style -->
		<link rel="stylesheet" type="text/css" href="assets/css/main.css">

		<!-- Website Font style -->
	    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">
		
		<!-- Google Fonts -->
		<link href='https://fonts.googleapis.com/css?family=Passion+One' rel='stylesheet' type='text/css'>
		<link href='https://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'>

		<title>Registration form</title>
	</head>
	
<script type="text/javascript">
function submitfunction()
{
if(document.form.username.value=="")
{
alert("enter your name ");
return false;
}

if(document.form.password.value=="")
{
alert("enter your password ");
return false;
}

if(document.form.email.value=="")
{
alert("enter your email address");
return false;
}

if(document.form.mobile.value=="")
{
alert("enter your phone number ");
return false;
}
if(document.form.mobile.value.length<10||document.form.mobile.value.length>10)
{
alert("please provide 10 digits");
return false;
}

if(document.form.nationality.value=="-1")
{
alert("please select your nationality");
return false;
}

else 

{
alert("registered successfully");
return true;
}
}
		
</script>
<style>
.container 
{
  position: relative;
  z-index: 1;
  background: #FFFFFF;
  max-width: 560px;
  margin-top: 5%;
  margin-bottom: 100%;
  margin-left: 55%;
  top: 0px;
  padding: 45px;
  text-align: left;
  align: left;
  box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
 .form-horizontal .control-label{
    text-align: left;
}
.footer {
  position: fixed;
  margin-top: 150px; /* negative value of footer height */
  height: 150px;
  clear:both;
  padding-top:20px;
  background color: #fefefe;
} 
html, 
body {
    height: 100%;
}
* html #footer {
   position:absolute;
   top:expression((0-(footer.offsetHeight)+(document.documentElement.clientHeight ? document.documentElement.clientHeight : document.body.clientHeight)+(ignoreMe = document.documentElement.scrollTop ? document.documentElement.scrollTop : document.body.scrollTop))+'px');
}

/* .background-image1  
{
background: url();
 }
 */ 
/* .body  {
    background-image: url("1.jpg");
    background-color: #cccccc;
    align: center;
       }
 */  
 
 
</style>
	<body style = "background : url(./resources/regwall.jpg)">
<jsp:include page="header.jsp"/>
 
 <!-- 
<img src="images/babydress.jpg" width="300px" height="300px" > -->
<c:url var="addAction" value="/RegisterSuccess">
</c:url>
<form method="post" action="${addAction}" commandName="Userdetails" class="form-horizontal">
		
<div class="container">

   		<div class="panel-heading">
	        <div class="panel-title text-center">
	            <h2 class="title">Registration Form</h2>
	            
	        </div>
	       <!--   <img src=<c:url value="/resources/new.jpg"/> class="img-responsive" alt="Slide 4" width="1024px" height= "1024px"> -->    
	<%-- <div class= "form">       
	<div class="form-group"><br><br>
    <label class="control-label col-xs-2"><spring:message text="Userid:"/></label>
    <div class="col-xs-6">
      <div class="input-group">
    <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>    
      <input type="userid" class="form-control" name="userid" required="true">
    </div>
    </div>
    </div>
    </div>
   --%>
  
    <div class= "form"><br>
	<div class="form-group">
    <label class="control-label col-xs-2"><spring:message text="Name:"/></label>
    <div class="col-xs-6">
      <div class="input-group">
    <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>    
      <input type="Fullname" class="form-control" name="Fullname" required="true">
    </div>
    </div>
    </div>
    </div>
  
  
  
    <div class= "form">
    <div class="form-group">    
    <label class="control-label col-xs-2"><spring:message text="Username:"/></label>
    <div class="col-xs-6">
      <div class="input-group">
    <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>    
      <input type="text" class="form-control" name="username" required="true">
    </div>
    </div>
    </div>
    </div>
 
  <div class= "form">
    <div class="form-group">
    <label class="control-label col-xs-2"><spring:message text="Password:"/></label>
    <div class="col-xs-6"> 
       <div class="input-group">
      <span class="input-group-addon"><i class="fa fa-lock fa" aria-hidden="true"></i></span>
      <input type="password" class="form-control" name="password" pattern=".{6,8}" required="true" title="password should contain 6 to 8 characters">
    </div>
    </div>
    </div>
    </div>
  
<div class= "form">
    <div class="form-group">
    <label class="control-label col-xs-2"><spring:message text="Email:"/></label>
    <div class="col-xs-6">
      <div class="input-group">
    <span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>    
      <input type="email" class="form-control" name="email" required="true">
    </div>
    </div>
    </div>
  
  <div class= "form">
  <div class="form-group">
    <label class="control-label col-xs-2"><spring:message text="Mobile no:"/></label>
    <div class="col-xs-6">
      <div class="input-group">
    <span class="input-group-addon"><i class="fa fa-phone fa" aria-hidden="true"></i></span>    
      <input type="number" class="form-control" name="mobile" pattern=".{10,12}" required="true" title="mobile numer should contain 10 or 12 digits"required="true">
    </div>
    </div>
    </div>
  <br>
 <center><button type="submit" class="btn btn-success">SUBMIT</button></center>
 </div>
 </div>
</form>
</body>
</html>
