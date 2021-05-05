package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Visitor;

import dao.Operation;


@WebServlet("/UpdateVisitor")
public class UpdateVisitor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public UpdateVisitor() {
        super();
       
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		
		int id = Integer.parseInt(request.getParameter("vid"));
		System.out.println("visitor id"+id);
		String vname= request.getParameter("vname");
		String email= request.getParameter("email");
		String address= request.getParameter("address");
		int contact= Integer.parseInt(request.getParameter("contact"));
		String qualification= request.getParameter("qualification");
		String purpose= request.getParameter("purpose");
		
		Visitor v= new Visitor();
		Operation o = new Operation();
		v.setVid(id);
		v.setVname(vname);
		v.setEmail(email);
		v.setAddress(address);
		v.setContact(contact);
		v.setQualification(qualification);
		v.setPurpose(purpose);
		
		if(o.updateVisitorById(v)!=0){
			response.sendRedirect("ViewVisitor.jsp");
		}else{
			out.println("<h2 style='color:red'>Error in record updation...!!</h2>");
		}
		
	}

}
