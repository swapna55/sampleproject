<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<head>
    <link rel="stylesheet" type="text/css" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css">
<style>
#footer { 
    height: auto;
    min-width:1100px;
     

}

body{
    margin-top:20px
}

.fa{
    font-size:24px;
    margin-right:5px
}

.row-first{
    margin-bottom:10px;
    margin-top:8px
}
.title-footer{
    margin-top:32px;
}

a {
    transition:all .3s ease;
    -webkit-transition:all .3s ease;
    -moz-transition:all .3s ease;
    -o-transition:all .3s ease
}

.main-footer{
    color:#fff;
    background-color:#000;
    text-align:center;
}

.contact a{
    display:block;
    background-color:#292b34;
    font-size:20px;
    text-align:center;
    color:#fff;
    padding:7px;
}

.contact a:hover{
    background-color:rgba(255,255,255,0.85);
    text-decoration:none
}

.contact a.skype:hover,.fa-skype{
    color:#00aff0;
}

.contact a.google:hover,.fa-instagram{
    color:#dd4b39;
}

.contact a.linkedin:hover,.fa-facebook{
    color:#0e76a8;
}

.contact a.twitter:hover,.fa-twitter{
    color:#00acee;
}
</style>
</head>
<body>
<br><br><br><br><br><br><br><br><br><br><br><br><br>
    
    <section id="footer" style="background-color:#292b34;">
        <div class="container">
    		<center style="color:#fff;">
    		<div class="container">
    		    <div class="well well-sm main-footer"  style="background-color:#292b34; border:0px">
    		        <div class="row">
    		            <div class="col-md-12">
    		                <div class="row">
    		                    <div class="col-md-4">
    		                        <h1 class="title-footer">
    		                            Quick Contact</h1>
    		                    </div><!--end .col-md-4-->
    		                    <div class="col-md-4 contact-email">
    		                        <h2>
    		                            <a href="mailto:nico@nicoplyley.com">nico@nicoplyley.com</a></h2>
    		                        <h3>
    		                            © Copyright Nico Plyley 2014</h3>
    		                    </div><!--end .col-md-4 .contact-email-->
    		                    <div class="col-md-4">
    		                        <div class="row contact row-first">
    		                            <div class="col-md-6">
    		                                <a href="skype:nico.plyley?chat" class="skype"><i class="fa fa-skype"></i>nico.plyley</a>
    		                            </div><!--end .col-md-6-->
    		                            <div class="col-md-6">
    		                                <a href="http://instagram.com/nicoplyley" class="instagram"><i class="fa fa-instagram"></i>@nicoplyley</a>
    		                            </div><!--end .col-md-6-->
    		                        </div><!--end .row .contact .row-first-->
    		                        <div class="row contact">
    		                            <div class="col-md-6">
    		                                <a href="http://facebook.com/nicoplyley" class="facebook"><i class="fa fa-facebook"></i>@nicoplyley</a>
    		                            </div><!--end .col-md-6-->
    		                            <div class="col-md-6">
    		                                <a href="http://twitter.com/nicoplyley" class="twitter"><i class="fa fa-twitter"></i>@nicoplyley</a>
    		                            </div><!--end .col-md-6-->
    		                        </div><!--end .row .contact-->
    		                    </div><!--end .col-md-6-->
    		                </div><!--end .row-->
    		            </div><!--end .col-md-12-->
    		        </div><!--end .row-->
    		    </div><!--end .well .well-sm .main-footer-->
    		</div><!--end .container-->
    		</center>
    	</div><!--end .container-->
    </section><!--end #footer-->
    <!-- Sticky Footer -->
    <script type="text/javascript" src="js/footer.js"></script>
    <!-- Fade Contact Footer -->
    <script type="text/javascript" src="js/contactFade.js"></script>
</body>