<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<div class="content">
			<fieldset>
				<legend>Confirm Details</legend>
				<!-- for triggering webflow events using links,
					 the eventId to be triggered is given in "href" attribute as:
				 -->
				<%-- <a href="${flowExecutionUrl}&_eventId_home">Home</a><br /><br /> --%>
				<sf:form modelAttribute="userdetails">
					<%-- <sf:label path="userid" disabled="true" readonly="true">User ID:</sf:label>${userdetails.userid}
					<br /><br /> --%>
					<sf:label path="username">User Name:</sf:label>${userdetails.username}
					<br /><br />
					<sf:label path="fullname">Full Name:</sf:label>${userdetails.fullname}
					<br /><br />
					<sf:label path="email">Email Id:</sf:label>${userdetails.email}
					<br /><br />
					<sf:label path="contact">Contact No:</sf:label>${userdetails.contact}
					<br /><br />
					<sf:label path="password">Password:</sf:label>${userdetails.password}
					<br /><br />
					<!-- for triggering webflow events using form submission,
					 the eventId to be triggered is given in "name" attribute as:
					-->
					<input name="_eventId_edit" type="submit" value="Edit" /> 
					<input name="_eventId_submit" type="submit" value="Confirm Details" /><br />
				</sf:form>
			</fieldset>
		</div>
</body>
</html>