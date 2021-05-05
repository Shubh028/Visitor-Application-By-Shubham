package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Visitor;
import dao.Operation;




@WebServlet("/RegisterVisitor")
public class RegisterVisitor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public RegisterVisitor() {
        super();
       
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		int  vid  = Integer.parseInt(request.getParameter("vid"));
		String vname= request.getParameter("vname");
		System.out.println("name is "+vname);
		String email = request.getParameter("email");
		String address= request.getParameter("address");
		System.out.println("address is "+address);
		int contact = Integer.parseInt(request.getParameter("contact"));
		String qualification= request.getParameter("qualification");
		String purpose= request.getParameter("purpose");
		String vdate= request.getParameter("vdate");
		
		Visitor v= new Visitor();
		Operation db = new Operation();
		
		v.setVid(vid);
		v.setVname(vname);
		v.setEmail(email);
		v.setAddress(address);
		v.setContact(contact);
		v.setQualification(qualification);
		v.setPurpose(purpose);
		v.setVdate(vdate);
		
		if (db.AddVisitor(v)!=0) {
			System.out.println("Visitor Added....!!!!");
			
		} else {
			System.out.println("error in visitor addition");
		}
		RequestDispatcher rd= request.getRequestDispatcher("/ViewVisitor.jsp");
		rd.forward(request, response);
	}

}
