package com.java.may.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.may.dao.FilmDAO;
import com.java.may.domain.Film;

/**
 * Servlet implementation class GetFilmsByActor
 */
@WebServlet("/GetFilmsByActor")
public class GetFilmsByActor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetFilmsByActor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String age = request.getAttribute("age").toString();
		FilmDAO filmDao = new FilmDAO();
		if (age =="qw")
			filmDao.isGeneralUser = false;
		
		String actorId = (String)request.getParameter("actorId");
		String actorName = (String)request.getParameter("actorId");
		
		
		List<Film> films = filmDao.getFilmsByActorId(Integer.parseInt(actorId));
		request.setAttribute("films", films);
		request.getRequestDispatcher("filmsbyActor.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
