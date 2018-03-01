<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 2 - Fibonacci 25</title>
		<style>
			li {
				list-style-type: none;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 2 - Fibonacci 25</h1>
		<ul>
			<%--
				Add a list item (i.e. <li>) for each of the first 25 numbers in the Fibonacci sequence
				
				See exercise2-fibonacci.png for example output --%>
			
			<c:set var="n1" value="0"/>
			<c:set var="n2" value="1"/> 
			  
			 <c:forEach begin="1" end="25">
			 	<c:set var="n1" value="${n1 + n2}" />
			 	<c:set var="n2" value="${n1 - n2}" />
				<li><c:out value="${n1}" /> </li>
			</c:forEach>	  
	
			</ul>
	</body>
</html>

<%-- FOLLOWING WILL NOT WORK BECAUSE IT REQUIRES RECURSION WHICH DOES NOT WORK IN JSP (PRINCETON FIBONACCI REFERENCE)
	
	<c:forEach begin="1" end="25" var="n">
	<c:choose> 
	    	<c:when test="${n<=1}">
	    		<li> <c:out value ="${n}" /> </li>
	    	</c:when>
	    <c:otherwise >
	    	<li>	<c:out value="${(n-1) + (n-2)}"/> </li>
	    </c:otherwise>
	    </c:choose>
	</c:forEach> --%>

 
 
    