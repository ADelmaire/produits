package fr.delmaire.produits;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ArrayListTest
 */
@WebServlet("/arraylisttest")
public class ArrayListTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArrayListTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<String> villes = new ArrayList<>();
		
		villes.add("France");
		villes.add("Espagne");
		villes.add("Belgique");
		villes.add("Canada");
		villes.add("Inde");
		villes.add("Chine");
		
		System.out.println(villes.get(0)); //villes[0]
		villes.remove(1);
		villes.remove("Inde");
		
		villes.set(1, "Belgium"); //remplacer
		
		/* villes.clear();supprime tout*/
		
		if(villes.contains("France")) {
			System.out.println("vive le maroilles");
		}
		if (villes.contains("Espagne")) {
			System.out.println("pas de fromage");
		}
		
		request.setAttribute("villes", villes);
		
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/arraylisttest.jsp")
		.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/arraylisttest.jsp")
		.forward(request, response);
	}

}
