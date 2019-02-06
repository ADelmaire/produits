<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Accueil</h1>

<p><a href = "produits">Produits</a></p>

<div>
<p>Nom: ${personnes[0].nom} </p>
<p>Prénom:${personnes[0].prenom } </p>
<p>Age: ${personnes[0].age }</p>
<p>Poids: ${personnes[0].poids }</p>
<p>Taille: ${personnes[0].taille }</p>
================================
<p>Nom: ${personnes[1].nom}</p>
<p>Prénom:${personnes[1].prenom } </p>
<p>Age: ${personnes[1].age }</p>
<p>Poids: ${personnes[1].poids }</p>
<p>Taille: ${personnes[1].taille }</p>
================================
<p>Nom: ${personnes[2].nom}</p>
<p>Prénom:${personnes[2].prenom } </p>
<p>Age: ${personnes[2].age }</p>
<p>Poids: ${personnes[2].poids }</p>
<p>Taille: ${personnes[2].taille }</p>
================================
<p>Nom: ${personnes[3].nom}</p>
<p>Prénom:${personnes[3].prenom } </p>
<p>Age: ${personnes[3].age }</p>
<p>Poids: ${personnes[3].poids }</p>
<p>Taille: ${personnes[3].taille }</p>
</div>

</body>
</html>