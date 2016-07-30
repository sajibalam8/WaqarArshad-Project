package com.java.may.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.may.dao.ActorDAO;

/**
 * Servlet implementation class GetActors
 */
@WebServlet("/GetAllActors")
public class GetAllActors extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAllActors() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ActorDAO actorDAO = new ActorDAO();
		List actors = actorDAO.getActors();
		request.setAttribute("actorList", actors);
		//request.
		request.getRequestDispatcher("/getActors.jsp").forward(request, response);
		//response.sendRedirect("getActors.jsp");
		//response.getWriter().append("Served at: servlet is called ").append(""+actors.size());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
