package com.learnall.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();

//		int k = (int) req.getAttribute("k");
		
//		int k = Integer.parseInt (req.getParameter("k"));

		int k = 0;
		
		
		//using session
		HttpSession session = req.getSession();
		k = (int)session.getAttribute("k");

		
		//using cookie
		Cookie[] cookies = req.getCookies();
		for (Cookie cookie : cookies) {
			if(cookie.getName().equals("k")) {
				k = Integer.parseInt(cookie.getValue());
			}
		}
		
		k=k*k;
		
		out.println("Result is: " + k);
		
		System.out.println("Sq called");
	}

}
