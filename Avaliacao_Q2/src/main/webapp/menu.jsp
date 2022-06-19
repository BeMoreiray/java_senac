<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hotel São Patrício</title>
</head>
<body>
		<h4>
		<%
		String nome = (String) session.getAttribute("nome");
		%>
		Olá Sr(a) <mark><%=nome%></mark>!
		<br>
		Aqui estão os dados requisitados por você.
		</h4>
		
		<p>
		<%Integer noite = (Integer) session.getAttribute("noite"); %>
		Tempo total de hospedagem: 
		<mark>
		<%=noite%> dias
		</mark>
		</p>
		
	   <p>
		<%
		double conta = (Double) session.getAttribute("conta");
		%>
		Valor total da hospedagem:  
		<mark>
		 R$<%=conta %>
		</mark>
		</p>
	  
</body>
</html>