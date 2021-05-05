package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Visitor;
import dao.Operation;


@WebServlet("/DeleteVisitor")
public class DeleteVisitor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DeleteVisitor() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		
		int vid = Integer.parseInt(request.getParameter("vid"));
		
		Visitor v= new Visitor();
		Operation o = new Operation();
		
		if (o.deleteVisitor(vid)!=0) {
			System.out.println("Visitor Deleted....!!!!");
			
		} else {
			System.out.println("error in visitor Deletion");
		}
		RequestDispatcher rd= request.getRequestDispatcher("/ViewVisitor.jsp");
		rd.forward(request, response);
	}

}
