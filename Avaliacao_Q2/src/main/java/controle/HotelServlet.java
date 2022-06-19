package controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/HotelServlet")
public class HotelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public HotelServlet() {
        super();
    
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				doPost(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session = request.getSession();
		Integer test = Integer.parseInt(request.getParameter("dias"));
		
		String test2 = request.getParameter("nome");

		int noite = test;
		double conta = 0;
		String nome = test2;
		
		

		for (int i = 1; i <= noite; i++) {
			conta += (100 / i);
		}

		
			response.sendRedirect("menu.jsp");
			session.setAttribute("conta", conta);
			session.setAttribute("nome", nome);
			session.setAttribute("noite", noite);
		
	}

}
