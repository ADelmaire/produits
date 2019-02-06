<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exo jstl</title>
</head>
<body>

	<h1>Exo Jstl</h1>
	<div>
		<form action="exojstl" method="post">
		<%-- renvoie au doPost de la servlet exojstl --%>
			<fieldset>
				<labelfor"nombre">Nombre</label> <input type="text" id="nombre"
					name=nombre "/>
				<br />

				<labelfor "modulo">Modulo</label>
<input type = "text" id = "modulo" name = "modulo"/><br/>

<input type = "submit" value = "valider"/>

			</fieldset>
		</form>
	</div>

</body>
</html>