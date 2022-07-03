package co.jik.blog.profile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.jik.blog.common.Command;

public class Profile implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		return "profile/profile";
	}

}
