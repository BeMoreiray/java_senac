<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hotel S�o Patr�cio</title>
</head>
<body>
<h1>BEM VINDO AO HOTEL S�O PATR�CIO</h1>
		<h3>O que podemos ajudar?</h3>
		<form action="HotelServlet" method="post" autocomplete="off">
		<p>Informe seu nome completo: </p>
			<input type="text" name="nome" required="required">
			
			<p>Informe quantos dias permanecer� no Hotel: </p>
				<input type="number" name="dias" required="required"/>
				
				<input type="submit" name="calcular" value="Calcular">
		</form>
</body>
</html>