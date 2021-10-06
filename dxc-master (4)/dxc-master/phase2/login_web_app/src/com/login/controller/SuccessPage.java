package com.login.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SuccessPage
 */
public class SuccessPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SuccessPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession(false);
		if(session==null) {
			out.print("<center><h2>Please Login First</h2></center>");
		}else {
//		out.print("<h3>Welcome "+request.getParameter("username")+"</h3>");
//		out.print("<h3>You have logged in successfully at "+new Date()+" </h3>");
//		out.print("<a href='/login_web_app'>Logout</a>");
			out.print("<h3> Hello "+session.getAttribute("username")+" </h3>");
			out.print("<h3>You have logged in successfully at "+new Date(session.getCreationTime())+" </h3>");
			out.print("<a href='logout'>Logout</a>");
		}
	}

}
