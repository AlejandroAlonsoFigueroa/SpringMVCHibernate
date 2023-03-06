<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action = "sesion-iniciada" method = "POST">
		<div>
			<div>
				<p>Nombre</p>
				<input type = "text" name = "nombreUsuario"/>
			</div>
			<div>
				<p>Contraseña</p>
				<input type = "text" name = "contra"/>
			</div>
			
			<div>
				<h2>Datos de la dirección</h2>			
			</div>
			<div>
				<p>Calle</p>
				<input type = "text" name = "direccionUs.calle"/>
			</div>
			<div>
				<p>Avenida</p>
				<input type = "text" name = "direccionUs.avenida"/>
			</div>
			<div>
				<p>Numero de la casa</p>
				<input type = "text" name = "direccionUs.numeroCasa"/>
			</div>
			
			<div>
				<button type = "submit">Iniciar sesión</button>
			</div>
		</div>
	</form>
</body>
</html>