<%@page import="dao.UsuarioDAO"%>
<%@page import="modelo.Usuario"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu</title>

<script>
	function confirmarExclusao(id) {
		var resposta = confirm("Confirmar a exlcus�o do resgistro?")
		if (resposta == true) {
			window.location.href = "ExcluirUsuarioServelet?id=" + id;

		}
	}
</script>
</head>
<body>
	<%
	String nome = (String) session.getAttribute("usuarioSession");
	%>

	<h2>
		Bem vindo ao sistema,
		<%=nome%></h2>

	<div>
		<h2>Lista de Usu�rios</h2>
	</div>
	<div>
		<table border=1>
			<tr>
				<th>ID</th>
				<th>NOME</th>
				<th>USU�RIO</th>
				<th colspan=2></th>
			</tr>

			<%
			UsuarioDAO dao = new UsuarioDAO();
			List<Usuario> lista = new ArrayList<Usuario>();

			lista = dao.listar();

			for (Usuario usuario : lista) {
			%>
			<tr>
				<td><%=usuario.getId()%></td>
				<td><%=usuario.getNome()%></td>
				<td><%=usuario.getUsuario()%></td>
				<td><a href="PrepararAlteracaoUsuarioServlet?id=<%=usuario.getId()%>"><img src="images/edit.png" width="24px" /></a></td>
				<td><a href="ExcluirUsuarioServlet?id=<%=usuario.getId()%>"><img
						src="images/delete.png" width="24px" /></a></td>
			</tr>
			<%
			}
			%>
		</table>
		<div>
			<nav>
				<ul>
					<li><a href="cadastrar.jsp">Incluir Usu�rio</a></li>
					<li><a href="LogoutServlet">Logout</a></li>
				</ul>
			</nav>
		</div>
	</div>
</body>
</html>