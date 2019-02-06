package fr.delmaire.produits;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.delmaire.produits.bean.Produit;

/**
 * Servlet implementation class ProduitsServlet
 */
@WebServlet("/produits")
public class ProduitsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProduitsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Produit axe = new Produit
				("Axe", 3.50, "ressources/images/produit/axe.jpg", "https://www.unilever.com/brands/personal-care/axe.html");
		Produit cafe = new Produit("Café", 3.25, "ressources/images/produit/cafe.jpg", "https://www.meo.fr/");
		Produit eau = new Produit("Cristaline", 1.20, "ressources/images/produit/cristaline.jpg", "https://www.moneaucristaline.fr/");
		Produit spec = new Produit("Speculoos", 2.40, "ressources/images/produit/speculoos.jpg", "https://maisondandoy.com/fr/speculoos");
		Produit choco = new Produit("Côte d'or", 2.20, "ressources/images/produit/choco.jpg", "https://fr.cotedor.be/");
		Produit chaussettes = new Produit("Chaussettes", 5.50, "ressources/images/produit/chaussettes.jpg", "https://www.dim.fr/c/chaussettes-femme-16000/");
		
		Produit[]produits = {axe, cafe, eau, spec, choco, chaussettes};
		
		request.setAttribute("produits", produits);
		
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/produits.jsp")
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
