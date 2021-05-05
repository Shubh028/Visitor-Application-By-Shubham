<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Visitor</title>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" />
</head>

<body class="bg-warning">
	<div class="container">

		<div class="col-md-4">

			<h3 class="text-center text-upper text-danger">Add Visitor</h3>
			<form action="RegisterVisitor" method="post">
				<div class="form-group">
					<label>Enter ID</label> <input type="text" class="form-control"
						name="vid">
				</div>
				<div class="form-group">
					<label>Enter Name</label> <input type="text" class="form-control"
						name="vname">
				</div>
				<div class="form-group">
					<label>Enter Email</label> <input type="text" class="form-control"
						name="email">
				</div>
				<div class="form-group">
					<label>Enter Address</label> <input type="text"
						class="form-control" name="address">
				</div>
				<div class="form-group">
					<label>Enter Contact</label> <input type="text"
						class="form-control" name="contact">
				</div>
				<div class="form-group">
					<label>Enter Qualification</label> <input type="text"
						class="form-control" name="qualification">
				</div>
				<div class="form-group">
					<label>Enter Purpose</label> <input type="text"
						class="form-control" name="purpose">
				</div>
				<div class="form-group">
					<label>Enter Date</label> <input type="date"
						class="form-control" name="vdate">
				</div>

				<button type="submit" class="btn btn-primary">Register User</button>
			</form>
		</div>

	</div>
</body>
</html>