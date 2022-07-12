<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<title>CRUD Java Web</title>
</head>
<body>

	<div class="container">
		<div class="row ">
			<div class="col s12">
				<div class="card   darken-1">
					<div class="card-content ">
						<div class="responsive-table">
							<table class="highlight centered responsive-table striped">
								<thead>
									<tr class="info">
										<th>ID</th>
										<th>Username</th>
										<th>Nome</th>
										<th>Email</th>

										<th>Editar</th>
										<th>Apagar</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${logins}" var="login">
										<tr class="active">
											<td><c:out value="${login.user_id}" /></td>
											<td><c:out value="${login.username}" /></td>
											<td><c:out value="${login.fullname}" /></td>
											<td><c:out value="${login.email}" /></td>


											<td><a
												class="#4fc3f7 light-blue lighten-2  btn-floating   modal-trigger "
												href="LoginController?action=editar&id=<c:out value="${login.user_id }"/>">
													<i class="material-icons left">editar</i>
											</a></td>
											<td><a class="red  btn-floating modal-trigger "
												id=apagar
												href="LoginController?action=apagar&id=<c:out value="${login.user_id }"/> ">
													<i class="material-icons left">delete</i>
											</a></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
						<br>
						<p>
						<form method="get" action="LoginController">
							<input type="hidden" name="action" value="ADICIONAR">
							<button class="btn green ">Cadastrar</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>