<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 <style>
   /* Remove the navbar's default rounded borders and increase the bottom margin */
        /* Remove the navbar's default rounded borders and increase the bottom margin */
    .navbar {
      margin-bottom: 60px;
      border-radius: 10px;
     
    }
   
    /* Remove the jumbotron's default bottom margin */
      .jumbotron {
      margin-bottom: 0;
      padding:50px;
     
         }
   
   
    h2{
    color: white;
    text-shadow: 1px 1px 2px black, 0 0 25px blue, 0 0 5px darkblue;

font-weight:bold;
font-size:40px;
}
#header {
position:fixed;
top:0px;
left:0px;
width:100%;
padding:15px;
}

     
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
  .h1 {
   color: #ea503f;
   font-family: courier;
 }
  }
   html, body {
  height: 100%;
}

#wrap {
  min-height: 100%;
}

#main {
  overflow:auto;
  padding-bottom:150px; /* this needs to be bigger than footer height*/
}

.footer {
  position: relative;
  margin-top: -150px; /* negative value of footer height */
  height: 150px;
  clear:both;
  padding-top:20px;
  background color: #fefefe;
} 
  
 
  </style>
 
</head>
<body>
<div class="jumbotron" style="background:  #708090;">
  <h1>Style shop</h1>
  <p>All you need is a warehouse, some wheels and boxbee</p>
</div>

<nav class="navbar navbar-inverse">

  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">styleshop</a>
    </div>
    
    <ul class="nav navbar-nav">
<li><a href=" "><span class="glyphicon glyphicon-home"></span> Home</a></li>
 
      
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Gift Cards <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Birthday cards</a></li>
          <li><a href="#">Wedding cards</a></li>
          <li><a href="#">Friendship cards</a></li>
        </ul>
      </li>


 <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Clothing<span class="caret"></span></a>   
     <ul class="dropdown-menu">
          <li><a href="#">Kurtis</a></li>
          <li><a href="#">Materials</a></li>
          <li><a href="#">Sarees</a></li>
           <li><a href="#">T-shirts</a></li>
           <li><a href="#">Jeans</a></li>
        </ul>
        </li>
        
        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Electronic items <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Laptops</a></li>
          <li><a href="#">cellphones</a></li>
          <li><a href="#">Watches</a></li>
          <li><a href="#">Headphones</a></li>
          <li><a href="#">Blueetooths</a></li>
        </ul>
      </li>
      
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Sports <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Athletic clothing</a></li>
          <li><a href="#">Shoes</a></li> 
          <li><a href="#">Foot balls</a></li>
          <li><a href="#">Basket balls</a></li>
          <li><a href="#"></a></li>
        </ul>
      </li>
        
        

    </ul>

    <ul class="nav navbar-nav navbar-right">
      <li><a href="Register"><span class="glyphicon glyphicon-user"></span> Sign up</a></li>
      <li><a href="LoginHere"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>

  </div>
</nav>

<div id="carousel" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
            <li data-target="#carousel" data-slide-to="0" class="active"></li>
            <li data-target="#carousel" data-slide-to="1"></li>
            <li data-target="#carousel" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner">
            <div class="item active">
                <img src=<c:url value="/resources/cards.jpg"/> class="img-responsive" alt="Slide 1" width="460" height="345">
            </div>
            <div class="item">
               <img src=<c:url value="/resources/dress.jpg"/> class="img-responsive" alt="Slide 2" width="460" height="345">
            </div>
             <div class="item">
                <img src=<c:url value="/resources/mobiles.jpg"/> class="img-responsive" alt="Slide 3" width="460" height="345">
            </div>
        
            <div class="item">
                <img src=<c:url value="/resources/shoes.jpg"/> class="img-responsive" alt="Slide 4" width="460" height="345">
            </div>
            <div class="item">
                <img src=<c:url value="/resources/tab.jpg"/> class="img-responsive" alt="Slide 5" width="460" height="345">
            </div>
        
        
        </div>
        <a href="#carousel" class="left carousel-control" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left"></span>
        </a>
        <a href="#carousel" class="right carousel-control" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right"></span>
        </a>
    </div>
<jsp:include page="footer.jsp"/>
</body>
</html>