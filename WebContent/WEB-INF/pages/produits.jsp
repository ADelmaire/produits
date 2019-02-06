
<%@page import="fr.delmaire.produits.bean.Produit"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!DOCTYPE html>

<html>
<head>
    <meta charset="UTF-8">
    <title>Produits</title>
    <link rel="stylesheet"  href="ressources/css/produits.css"/>
</head>
<body>

<h1>Liste des produits</h1>

<div id="conteneur">

<%
Produit[] produits = (Produit[])request.getAttribute("produits");
for (int i = 0; i< produits.length; i++) {
	System.out.println(produits[i].getNom() + " - ");
%>
<div class="bloc_produit">
   <div class="prix"><label><%= produits[i].getPrix() %> &euro;</label></div>
    <a href="<%= produits[i].getLienSiteOff() %>">
    <img src="<%= produits[i].getLienImage() %>"/>
    </a>
<div class="description"><%= produits[i].getNom() %></div>
</div>
<% } %>

</div>

</body>
</html>