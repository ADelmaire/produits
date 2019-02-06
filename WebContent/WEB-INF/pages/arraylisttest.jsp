<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>array list</title>
</head>
<body>

<h1>Arraylist</h1>

<%
ArrayList<String> villes =
(ArrayList<String>) request.getAttribute("villes");
%>


<p>
Taille du tableau: <%= villes.size() %>
</p>

<%
for (int i = 0; i< villes.size(); i++) {
	out.print(villes.get(i) + "<br/>");
}
%>

<% if(villes.isEmpty()) { %>
<p>Le tableau est vide</p>
<% } %>

<%
for (int i = 0; i< villes.size(); i++) {
	out.print(villes.get(i) + "<br/>");
}
%>

<h1>EL</h1>
<p>
Tableau villes: ${villes }
</p>

<p>
<ul>
<li>${ villes[0] }</li>
<li>${ villes[1] }</li>
<li>${ villes[2] }</li>
<li>${ villes[3] }</li>
</ul>
</p>


</body>
</html>