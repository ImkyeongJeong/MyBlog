package co.jik.blog.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.jik.blog.common.Command;
import co.jik.blog.home.Home;

@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    HashMap<String, Command> map = new HashMap<String, Command>();

    public FrontController() {
        super();
    }

	public void init(ServletConfig config) throws ServletException {
		map.put("/home.do", new Home());
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String uri = request.getRequestURI();				// /blog/home.do
		String contextPath = request.getContextPath();		// /blog
		String page = uri.substring(contextPath.length());	// /home.do
		
		Command command = map.get(page);					// map의 key(/home.do)값으로 value(new Home())를 대입
		
		String viewPage = command.exec(request, response);	// 메서드 실행시켜 return값을 viewPage에 담음 (home/home)
		
		if (!viewPage.endsWith(".do")) {
			if(viewPage.startsWith("ajax:")) {				// ajax호출 처리부분
				response.setContentType("text/html; charset=UTF-8");
				viewPage = viewPage.substring(5);
				response.getWriter().append(viewPage);
				return;
			}else {
				viewPage = viewPage + ".tiles";				// home/home으로 tiles의 body로 태운다
			}
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}

}
