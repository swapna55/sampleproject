	<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%-- 
<%@include file="header.jsp"%> --%>
<jsp:include page="header.jsp"/>

<div class="span9" >
	 
					<h2>Thank you for Shopping</h2>
					<h3>Your order submitted successfully.</h3>

                    <p>Your order will be shipped with in three business days!</p>
                <div class="span5">
             <a href="<spring:url value="/" />" class="btn btn-primary">Ok</a>
			</div>	
</div>

