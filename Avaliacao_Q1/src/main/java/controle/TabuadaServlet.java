package controle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import modelo.Numero;

@WebServlet("/TabuadaServlet")
public class TabuadaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TabuadaServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");

		int tabuada = Integer.parseInt(request.getParameter("calcular"));

		try (PrintWriter out = response.getWriter()) {
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title> Tabuada </title>");
			out.println("</head>");
			out.println("<h1>Resultado tabuada </h1>");
			for (int i = 0; i <= 10; i++)
				out.println(tabuada + " x " + i + " = " + tabuada * i + "<br />");
			out.println("</body>");
			out.println("</html>");
		}

	}

}
