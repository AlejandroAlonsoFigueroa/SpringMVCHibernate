<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

	<style>
		p{
			margin: 0px;
			padding: 0px;
		}
	</style>
</head>
<body>
	<form method = "POST" action = "recibir-usuario">
		<div>
			<p>Nombre</p>
			<input type = "text" name = "nombre"/>
		</div>
		<div>
			<p>Apellidos</p>
			<input type = "text" name = "apellidos"/>
		</div>
		<div>
			<p>Teléfono</p>
			<input type = "text" name = "tel"/>
		</div>
		<div>
			<button type = "submit">Mandar usuario</button>
		</div>
	</form>
</body>
</html>