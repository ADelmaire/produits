<%@page import="fr.delmaire.produits.bean.Utilisateur"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel = "stylesheet" href = "ressources/css/utilisateur.css"/>
<title>Utilisateurs</title>
</head>
<body>
<h1>Liste des utilisateurs</h1>

<div id="conteneur">

<%
Utilisateur[] utilisateurs = (Utilisateur[])request.getAttribute("utilisateurs");
for (int i = 0; i < utilisateurs.length; i++) {
%>

<div class="bloc_produit">

   <div class="prix"><label><%= utilisateurs[i].getAge() %> ans</label></div>
 
    <img src="<%= utilisateurs[i].getUrlImage() %>"/>
    
<div class="description"><%= utilisateurs[i].getNom() +" " + utilisateurs[i].getPrenom() %></div>

</div>
<% } %>

</div>

</body>
</html>