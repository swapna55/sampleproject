
<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
   <style>
    /* Remove the navbar's default rounded borders and increase the bottom margin */
    .navbar {
      margin-bottom: 60px;
      border-radius: 10px;
     
    }
   
    /* Remove the jumbotron's default bottom margin */
      .jumbotron {
      margin-bottom: 0;
      padding:5px;
     
         }
         footer {
      background-color: #555;
      color: white;
      padding: 15px;
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

/* .thumbnail {
    padding: 0 0 30px 0;
    border: black;
    border-radius: 5px;
}

.thumbnail img {
    width: 50%;
    height: 50%;
    margin-bottom: 30px;
    border color:black;
}
     */
     .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
     width:70%;
      margin: auto;
  }
  </style>
</head>
<body>
<div class="jumbotron">
   <img src="E:\programs\ShoppingCartFrontEnd\src\main\webapp\images\babykids6.png" width="1000" height="200">
 
</div>
<br><br>
${message }<br><br>
Welcome ${username }

 
      <ul class="nav navbar-nav navbar-right">
        <li><a href="logout"><span class="glyphicon glyphicon-user"></span> Log-out</a></li>
        
      </ul>
   
<!-- <div id="myCarousel" class="carousel slide" data-ride="carousel">
  Indicators
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
     
   
  </ol>

 Wrapper for slides
  <div class="carousel-inner" role="listbox">
    <div class="item active">
      <img src="E:\programs\ShoppingCartFrontEnd\src\main\webapp\images\babykids.jpg" width="460" height="345">
      <div class="carousel-caption">
          <h3>Cute Doll</h3>
         
        </div>
    </div>

    <div class="item">
      <img src="E:\programs\ShoppingCartFrontEnd\src\main\webapp\images\babykids1.png" width="460" height="345">
      <div class="carousel-caption">
          <h3>Child Toys Playing People Play</h3>
          
        </div>
    </div>

    <div class="item">
      <img src="E:\programs\ShoppingCartFrontEnd\src\main\webapp\images\babykids2.jpg" width="460" height="345">
      <div class="carousel-caption">
          <h3>Bear Toys</h3>
          
        </div>
    </div>
<div class="item">
      <img src="E:\programs\ShoppingCartFrontEnd\src\main\webapp\images\babykids3.jpg" width="460" height="345">
      <div class="carousel-caption">
          <h3>Toy Ducks,Plastic,Toys,Ducks</h3>
         
        </div>
    </div>
   
  </div>
  
  Left and right controls
  <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>   -->
<br><br>
 <!-- <div class="container-fluid text-center bg-grey">
  
  <div class="row text-center">
<a href="#"> <div class="col-sm-4">
      <div class="thumbnail">
        <img src="E:\programs\BabysCart\src\main\webapp\images\girlswear5.jpeg">
           <p><strong>Arika Girl's Layered Black Dress</strong></p>
        <p>Purchase Now @ Rs.959/-</p>
      </div>
    </div></a>
    <a href="#"><div class="col-sm-4">
      <div class="thumbnail">
        <img src="E:\programs\BabysCart\src\main\webapp\images\girlswear6.jpeg">
           <p><strong>Kilkari Girl's Kurti</strong></p>
        <p>Purchase Now @ Rs.400/-</p>
      </div>
    </div></a>
    <a href="#"><div class="col-sm-4">
      <div class="thumbnail">
        <img src="E:\programs\BabysCart\src\main\webapp\images\girlswear15.jpeg">
           <p><strong>Self Design Kurti & Patiyala</strong></p>
        <p>Purchase Now @ Rs.799/-</p>
      </div>
    </div></a></div></div> -->
    <div class="container-fluid text-center bg-grey">
			
			 <div class="row text-center">
<c:forEach items="${productList}" var="product">
				<div class="col-sm-4">
					<div class="thumbnail">
						<img src="E:\image/${product.name}.jpg" class="img-responsive" style="height:200px; width:60%"/>
						<div class="caption">
							<h4 class="pull-right">${product.price }</h4>
							<p>${product.name }</p>
							
									<a button class="<c:url value='addcart/${product.id}' />">Add to Cart</a>
								<%-- 	<a href="<c:url value='addcart/${product.id}' />">Add to Cart</a> --%>
							
						</div>
						<div class="ratings">
							<p class="pull-right">15 reviews</p>
							<p>
								<span class="glyphicon glyphicon-star"></span>
								 <span class="glyphicon glyphicon-star"></span>
								  <span	class="glyphicon glyphicon-star"></span>
								   <span class="glyphicon glyphicon-star"></span>
									 <span class="glyphicon glyphicon-star"></span>
							</p>
						</div>
					</div>
				</div>
</c:forEach>
		</div>
		</div>		

    
<footer class="container-fluid text-center">
  <p><span class="glyphicon glyphicon-copyright-mark"></span>      Online Store Copyright</p>

 
</footer>
</body>
</html>