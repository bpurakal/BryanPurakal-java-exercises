<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/header.jsp" />

<h2>Latest Messages</h2>
<ol class="message-list">
	<c:forEach items="${messages}" var="message">
		<li class="message">
			<c:url var="messageHref" value="/messages">
				<c:param name="userName" value="${message.fromUsername}" />
			</c:url>
			<span class="username"><a href="${messageHref}">${message.fromUsername}</a></span>
			<span class="message-text">${message.text}</span>
			<time class="timeago" datetime="${message.createTime}">${message.createTime}</time>
			<c:if test="${message.fromUesrname == currentUser}">
				<c:url var="deleteUrl" value="/messages/delete/${message.id }"/>
				<form action="${deleteUrl}" method="POST">
					<input type="submit" class="delete-button btn" value="X">
				</form>
			</c:if>
		</li>
	</c:forEach>
</ol>
		
<c:import url="/WEB-INF/jsp/footer.jsp" />
		