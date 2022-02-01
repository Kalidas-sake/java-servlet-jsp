package com.learnall.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));

		int c = a+b;
		
//		PrintWriter out= res.getWriter();
//		
//		out.println("Addition : "+c);
		
		// By setting attribute for same req
//		req.setAttribute("k", c);
		
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);
		
		
		
		HttpSession session = req.getSession();
		session.setAttribute("k", c);
		
		//using cookie to send data
		Cookie cookie = new Cookie("k", c+"");
		res.addCookie(cookie);
		
		// url query string URL Redirecting
		res.sendRedirect("sq?k="+c);
	}

}
