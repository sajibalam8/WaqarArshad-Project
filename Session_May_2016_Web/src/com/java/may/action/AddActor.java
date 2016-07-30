package com.java.may.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.may.dao.ActorDAO;
import com.java.may.domain.Actor;

/**
 * Servlet implementation class AddActor
 */
@WebServlet("/AddActor")
public class AddActor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddActor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getParameter("gender"));
		Actor actor = new Actor();
		actor.setFirstName(request.getParameter("firstName").toString());
		actor.setLastName(request.getParameter("lastName").toString());
		ActorDAO actorDao = new ActorDAO();
		actorDao.saveActor(actor);
		request.getRequestDispatcher("GetAllActors").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
