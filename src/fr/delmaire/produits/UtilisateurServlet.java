package fr.delmaire.produits;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.delmaire.produits.bean.Utilisateur;

/**
 * Servlet implementation class UtilisateurServlet
 */
@WebServlet("/utilisateur")
public class UtilisateurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UtilisateurServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Utilisateur pl = new Utilisateur("Lapin", "Pierre", "ressources/images/utilisateur/peter.jpg", 2);
		Utilisateur miffy = new Utilisateur("Lapin", "Miffy", "ressources/images/utilisateur/miffy.jpg", 35);
		Utilisateur bob = new Utilisateur("Sponge", "Bob", "ressources/images/utilisateur/bob.jpg", 12);
		Utilisateur gc = new Utilisateur("Slump", "Gatchan", "ressources/images/utilisateur/gatchan.jpg", 120);
		Utilisateur gz = new Utilisateur("Go", "Zilla", "ressources/images/utilisateur/gozilla.jpg", 70);
		
		Utilisateur[] utilisateurs = {pl, miffy, bob, gc, gz};
		
		request.setAttribute("utilisateurs", utilisateurs);
		
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/utilisateur.jsp")
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
