<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>






<script type="text/javascript">
function loginfunction()
 {
 if(document.form.username.value=="")
 {
 alert("please provide Usename ");
 return false;
 }
 if(document.form.password.value=="")
 {
 alert("please provide Password ");
 return false;
 }
 else
 {
 alert("login successfull");
 return true;
 }
 }
 
 </script>

<style>
family=Roboto:300);
.login-page {
  width: 360px;
  
  
}.form 
{
  position: relative;
  z-index: 1;
  background: #FFFFFF;
  max-width: 360px;
  margin-top:0%;
  margin-left:35%;
  padding: 45px;
  text-align: right;
  box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
}
.header h2
{height:44px; 
line-height:44px; 
 
text-align:center}
   
   
    #header {
position:fixed;
top:0px;
left:0px;
width:100%;
padding:15px;
}

     
  
.form input {
  font-family: "Roboto", sans-serif;
  outline: 0;
  background: #F1F1F3;
  width: 100%;
  border: 0;
  margin: 0 0 15px;
  padding: 15px;
  box-sizing: border-box;
  font-size: 14px;
}
.form button {
  font-family: "Roboto", sans-serif;
  text-transform: uppercase;
  outline: 0;
  background: #00FF99;
  width: 100%;
  border: 0;
  padding: 15px;
  color: #FFFFF;
  font-size: 14px;
  }

body {
  align: center;
  background: #6D6C71; /* fallback for old browsers */
  background-image: url("/resources/new.jpg");
  
  }
  .footer {
  position: absolute;
  margin-top: -150px; /* negative value of footer height */
  height: 150px;
  clear:both;
  padding-top:20px;
  background color: #fefefe;
} 
  
</style>
</head>

<body style="background : url(./resources/bg.jpg)">
<jsp:include page="header.jsp"/>
<div class="container">
<center><h2>welcome to styleshop!!</h2></center>

<%-- <div class="item">
  <center><img src=<c:url value="/resources/shoes.jpg"/> class="img-responsive" alt="Slide 4" width="600" height="600"></center>
   </div> 
 --%>
<%-- <c:url var="perform_Login" value="/Login"> 
</c:url>--%>
<form class="form-horizontal" method="post" onsubmit="return loginfunction()" action="perform_Login">

 <div class="form">
 ${msg}
 
<div class="header">
<h2>signin</h2>
 <div class="form-group  has-feedback has-feedback-right">

       <label class="control-label col-xs-4" >
       <spring:message text="USERNAME:" />
       </label>
       <div class="col-xs-6">
        <input type="text" class="form-control" name="username" >
        <i class="form-control-feedback glyphicon glyphicon-user"></i>

</div>
      </div>
    </div>
 <div class="form-group  has-feedback has-feedback-right">
   
       <label class="control-label col-xs-4" >
       <spring:message text="PASSWORD:" />
       </label>
       <div class="col-xs-6">
        <input type="password" class="form-control" name="password" >
        <i class="form-control-feedback glyphicon glyphicon-lock"></i>

      </div>
    </div>

<button>login</button>
      <p class="message">Not registered? <a href="Register.jsp">Create an account</a></p>
   


   
  </div>     
     </div>
 </form><br><br><br><br><br><br><br>
 <jsp:include page="footer.jsp"/> 
</body>
</html>
