package com.mresanto.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mresanto.dao.ILoginDAO;
import com.mresanto.dao.LoginDAO;
import com.mresanto.model.Login;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public static final String LIST_LOGIN = "/listaLogin.jsp";
	public static final String INSERT_EDIT = "/cadastrar.jsp";

	public LoginController() {

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ILoginDAO dao = new LoginDAO();

		String redirection = "";
		String action = req.getParameter("action");

		if (action.equalsIgnoreCase("APAGAR")) {
			redirection = LIST_LOGIN;
			int id = Integer.parseInt(req.getParameter("id"));
			dao.Apagar(id);
			req.setAttribute("logins", dao.Listar());
		} else if (action.equalsIgnoreCase("EDITAR")) {
			redirection = INSERT_EDIT;
			int id = Integer.parseInt(req.getParameter("id"));
			Login login = dao.ListarPorId(id);
			req.setAttribute("login", login);
		} else if (action.equalsIgnoreCase("ADICIONAR")) {
			redirection = INSERT_EDIT;
		} else {
			redirection = LIST_LOGIN;
			req.setAttribute("logins", dao.Listar());
		}
		RequestDispatcher vista = req.getRequestDispatcher(redirection);
		vista.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ILoginDAO dao = new LoginDAO();

		Login login = new Login();

		login.setUsername(req.getParameter("username"));
		login.setPswd(req.getParameter("pswd"));
		login.setFullname(req.getParameter("fullname"));
		login.setEmail(req.getParameter("email"));

		String id = req.getParameter("user_id");

		if (id == null || id.isEmpty())
			dao.Salvar(login);
		else {
			login.setUser_id(Integer.parseInt(id));
			dao.Atualizar(login);
		}
		RequestDispatcher vista = req.getRequestDispatcher(LIST_LOGIN);
		req.setAttribute("logins", dao.Listar());
		vista.forward(req, resp);
	}

	public boolean validator(Login login) {

		if (login.getUsername().length() < 46 || login.getUsername().equals("") || login.getUsername() == null)
			return false;
		else if (login.getPswd().length() < 256 || login.getPswd().equals("") || login.getPswd() == null)
			return false;
		else if (login.getFullname().length() < 101 || login.getFullname().equals("") || login.getFullname() == null)
			return false;
		else if (login.getEmail().length() < 101 || login.getEmail().equals("") || login.getEmail() == null)
			return false;
		return true;
	}
}
