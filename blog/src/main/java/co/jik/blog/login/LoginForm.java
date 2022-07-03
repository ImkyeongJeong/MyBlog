package co.jik.blog.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.jik.blog.common.Command;

public class LoginForm implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		return "login/loginForm";
	}

}
