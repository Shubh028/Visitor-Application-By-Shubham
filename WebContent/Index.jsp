<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body class="bg-warning">
	<div class="container">

		<div class="col-md-4">

			<h3 class="text-center text-upper text-danger">Add Admin</h3>
			<form action="Add_Admin" method="post">
			<h3 class="text-right text-upper text-danger">
				<a href="loggincheck.jsp" class="btn btn-outline-info">Already Registered</a>
			</h3>
			
				<div class="form-group">
					<label>Enter Admin ID</label> <input type="text" class="form-control"
						name="aid">
				</div>
				
				<div class="form-group">
					<label>Enter Email</label> <input type="text" class="form-control"
						name="email">
				</div>
				<div class="form-group">
					<label>Enter Password</label> <input type="password"
						class="form-control" name="password">
				</div>
				
				<button type="submit" class="btn btn-primary">Register Admin</button>
				
				
			</form>
		</div>

	</div>
</body>
</html>