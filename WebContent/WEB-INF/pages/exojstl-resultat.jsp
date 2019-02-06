<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exo jstl resultat</title>
</head>
<body>

	<h1>Tableau des nombres</h1>
<%--
Aller à la ligne à chaque multiple de "modulo"
remplacer les multiples de 3 et 4 par *
remplacer les multiples de7 par #
 --%>
	<c:forEach var="i" begin="1" end="${ nombre }">
	
		<c:choose>
			<c:when test="${i%3 == 0 && i%4 == 0 }">
				*
			</c:when>
			<c:when test="${ i%7 == 0 }">
				<c:out value="#" />
			</c:when>
			<c:otherwise>
				<c:out value="${ i }" />
			</c:otherwise>
		</c:choose>
		
		<c:if test="${i % modulo == 0 }">
			<br />
		</c:if>
	</c:forEach>

</body>
</html>