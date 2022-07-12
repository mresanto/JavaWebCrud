<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Cadastrar</title>
</head>
<body>
	<div class="container">
		<div class="row ">
			<div class="col s12">
				<div class="card   darken-1">
					<div class="card-content ">
						<form action="LoginController" method="post">
							<div>
								<label for="user_id">ID</label> <input type="text" name="user_id"
									class="form-control" value="<c:out value="${login.user_id}" />"
									readonly="readonly" placeholder="Login ID" />
							</div>
							<div>
								<label for="username">Username</label> <input type="text"
									class="form-control" name="username"
									value="<c:out value="${login.username}" />"
									placeholder="Username" maxlength="45" required />
							</div>
							<div>
								<label for="pswd">Senha</label> <input type="password"
									class="form-control" name="pswd"
									value="<c:out value="${login.pswd}" />"
									placeholder="Senha" maxlength="255" required/>
							</div>
							<div>
								<label for="fullname">Nome Completo</label> <input type=text
									class="form-control" name="fullname"
									value="<c:out value="${login.fullname}" />"
									placeholder="Nome Completo" maxlength="100" required/>
							</div>
							<div>
								<label for="email">Email</label> <input type="email"
									class="form-control" name="email"
									value="<c:out value="${login.email}" />"
									placeholder="exemplo@email.com" maxlength="100"  required/>
							</div>
							<br> <input type="submit" class="btn-small green "
								value="Salvar" />
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>