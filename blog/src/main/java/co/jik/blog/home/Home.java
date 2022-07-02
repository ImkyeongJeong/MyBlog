package co.jik.blog.home;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.jik.blog.common.Command;

public class Home implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// home페이지로 이동
		return "home/home";
	}

}
