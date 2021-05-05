<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="dao.Operation,bean.Visitor,java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body class="bg-warning">
<%
	int vid = Integer.parseInt(request.getParameter("vid"));
	Operation o = new Operation();
	Visitor v=o.getVisitorById(vid);
	
	%>
<div class="container">
	<div class="row">
	
	
	<div class="col-sm-4"> 
	<div class ="panel panel-primary"></div>
		<div class="panel-heading">
		<h4 class="text-center">Update Visitor</h4>
		</div>
	<div class="panel-body">
		<form action="UpdateVisitor" method="post">
			<div class="form-group">
				<input type="hidden" name="vid" class="form-control" value="<%= v.getVid() %>"  />
			</div>
			<div class="form-group">
				<label>Name</label>
				<input type="text" name="vname" class="form-control" value="<%= v.getVname() %>">
			</div>
			<div class="form-group">
				<label>Email</label>
				<input type="text" name="email" class="form-control" value="<%= v.getEmail() %>" />
			</div>
			<div class="form-group">
				<label>Address</label>
				<input type="text" name="address" class="form-control" value="<%= v.getAddress() %>" />
			</div>
			<div class="form-group">
				<label>Contact</label>
				<input type="text" name="contact" class="form-control" value="<%= v.getContact() %>" />
			</div>
			<div class="form-group">
				<label>Qualification</label>
				<input type="text" name="qualification" class="form-control" value="<%= v.getQualification() %>" />
			</div>
			<div class="form-group">
				<label>Purpose</label>
				<input type="text" name="purpose" class="form-control" value="<%= v.getPurpose() %>" />
			</div>
			<div class="form-group text-center">
				
				<input type="submit" class="btn btn-outline-info" style="width:200px" name="Edit" value="Update" />
			</div>
			</form>
		</div>
	</div>
</div>

</body>
</html>