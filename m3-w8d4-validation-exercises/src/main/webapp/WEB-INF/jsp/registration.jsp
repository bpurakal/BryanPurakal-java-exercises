<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<c:set var="pageTitle" value="Registration"/>
<%@include file="common/header.jspf" %>

<h2>Registration</h2>

<c:url var="registrationUrl" value="/register"/>
<form:form action="${registrationUrl}" method="POST" modelAttribute="registration">  <!--link form up with modelholder -->
<!-- look for attribute called registration to fill out required info -->
	<div class="form-group">
		<label for="firstName">First Name:</label>	
		<form:input path="firstName" class="form-control"/> <!-- previously name is now path -->
		<form:errors path="firstName" cssClass="error"/>
	</div>
	
	<div class="form-group">
		<label for="lastName">Last Name:</label>	
		<form:input path="lastName" class="form-control"/>
		<form:errors path="lastName" cssClass="error"/>
	</div>
	
	<div class="form-group">
		<label for="email">Email Address:</label>	
		<form:input path="email" class="form-control"/>
		<form:errors path="email" cssClass="error"/>
	</div>
	
	<div class="form-group">
		<label for="confirmEmail">Confirm Email:</label>	
		<form:input path="confirmEmail" class="form-control"/>
	</div>
	
	<div class="form-group">
		<label for="password">Password:</label>	
		<form:password path="password" class="form-control"/>
	</div>
	
		<div class="form-group">
		<label for="confirmPassword">Confirm Password:</label>	
		<form:password path="confirmPassword" class="form-control"/>
	</div>
	
	<div class="form-group">
		<label for="birthDate">Date of Birth (yyyy-mm-dd):</label>	
		<form:input path="birthDate" class="form-control"/>
	</div>
	
	<div class="form-group">
		<label for="numOfTickets">Number of Tickets:</label>	
		<form:input path="numOfTickets" class="form-control"/>
	</div>
	
	<input type="submit" value="Register!" class="btn btn-default"> <!--bootstrap that makes btn a btn and gives it a default color-->

</form:form>



<%@include file="common/footer.jspf" %>
