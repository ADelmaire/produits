package fr.delmaire.produits;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.delmaire.produits.bean.Personne;

/**
 * Servlet implementation class AccueilServlet
 */
@WebServlet ("/accueil")
// remplace le xml . version moins minimale: @WebServlet(name = "accueil", urlPatterns = { "/accueil" })
public class AccueilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccueilServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Personne jj = new Personne("James", "Jack", 45, 1.80, 80);
		Personne je = new Personne("John", "Eric", 55, 1.70, 70);
		Personne tg = new Personne("Thomas", "Georges", 15, 1.65, 60);
		Personne mb = new Personne("Mario", "Bros", 48, 1.50, 65);
		
		Personne[]personnes = {jj, je, tg, mb};
		
		request.setAttribute("personnes", personnes);
		
		
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/accueil.jsp")
		.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
