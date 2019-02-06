<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jstl</title>
</head>
<body>

	<h1>JSTL</h1>

	<c:set var="nom" value="James" />
	<!-- déclaration -->

	<c:out value="Bonjour avec JSTL" />
	<br />
	<%-- = out.println() ou ${"texte avec expression language"}
Dans un formulaire pr la sécutité utiliser plutot le c:out 
seul cas où il est vraiment utile--%>
	<c:out value="${nom }" />

	<br /> ${"texte avec el"}

	<c:if test="true">
		<h2>Titre dans un c:if</h2>
	</c:if>
	<%--
	<%if(true) %> {
		<h2>Titre dans un c:if</h2>
		}
   --%>

	<%-- jstl permet de faire tt ce qu'on faisait en java 
Trouvable sur des projets d'avant 2012
maintenant spring--%>

	<c:forEach begin="1" end="10" step="1">
		<p>boucle</p>
	</c:forEach>

	<%-- = 
<%
for(int i=0; i<10;i++) {
	%>
	<p>boucle avec if</p>
<% } %>
--%>

	<c:forEach begin="0" end="20" step="5">
		<p>STEP 5</p>
	</c:forEach>


	<c:forEach var="i" begin="1" end="10" step="1">
		<c:if test="${i%2 == 0 }">
			<c:out value="${i }" />
		</c:if>
	</c:forEach>


	<c:forEach var="i" begin="1" end="200" step="1">
		<c:out value="${i }" />
		<c:if test="${i%20 == 0 }">
			<br />
		</c:if>
	</c:forEach>

	<c:choose>
		<c:when test="${5 < 7}">
			<p>5 est sup à 7</p>
		</c:when>
		<c:when test="$ {7>5}">
			<p>7 est sup à 5</p>
		</c:when>
		<c:when test="${5 == 5 }">
			<p>5 = 5</p>
		</c:when>
		<c:otherwise>
			<p>toutes les conditions sont fausses</p>
		</c:otherwise>
	</c:choose>
	<!-- = if, else if, eslse if, else...
	Si une condition est vraie, arret
	(pas d'affichage 5=5) -->

	<p>Addition 12 et 14 : ${12+14}</p>
	<p>Soustraction 12 et14 : ${12 - 14}</p>
	<p>Multiplication 12 par 14 : ${12 * 14}</p>
	<p>Division 12 par 14 : ${12/14 }</p>
	<p>Modulo 12 et 14 : ${12 % 14}</p>

	<p>12 > 14? => ${12 > 14 }</p>
	<p>12 >=14 ? => ${12 >= 14}</p>
	<p>12 <=14 ? => ${12 <= 14}</p>
	<p>12 ==14 ? => ${12 == 14}</p>
	<p>12 !v=14 ? => ${12 != 14}</p>
	<br />

	<c:forEach items="${villes}" var="v">
		<li><c:out value="${v}" /></li>
	</c:forEach>
	<%-- boucle forEach la plus utilisée
Pour parcourir les tableaux 
détecte le type --%>

</body>
</html>