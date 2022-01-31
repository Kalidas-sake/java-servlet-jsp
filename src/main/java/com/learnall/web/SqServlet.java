package com.learnall.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();

//		int k = (int) req.getAttribute("k");
		
		int k = Integer.parseInt (req.getParameter("k"));

		k=k*k;
		
		out.println("Result is: " + k);
		
		System.out.println("Sq called");
	}

}
