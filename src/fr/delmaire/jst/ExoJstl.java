package fr.delmaire.jst;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExoJstl
 */
@WebServlet("/exojstl")
public class ExoJstl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExoJstl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/exojstl.jsp")
		.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombreString = request.getParameter("nombre");
		int nombre = Integer.parseInt(nombreString);
	
		request.setAttribute("nombre", nombre);
		
		String moduloString = request.getParameter("modulo");
		int modulo = Integer.parseInt(moduloString);
		/*String s = modulo + ""
		 * pour changer un nombre en chaine de caractères*/
		
		request.setAttribute("modulo", modulo);
		
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/exojstl-resultat.jsp")
		.forward(request, response);
	}

}
