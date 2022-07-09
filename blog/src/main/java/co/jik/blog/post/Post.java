package co.jik.blog.post;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.jik.blog.common.Command;

public class Post implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		return "post/post";
	}

}
