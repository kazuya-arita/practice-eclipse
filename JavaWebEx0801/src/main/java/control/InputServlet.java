package control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InputServlet
 */
@WebServlet("/input-servlet2")
public class InputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		
		String nameStr = "【名前】" + request.getParameter("name");
		String verbalArray[] = request.getParameterValues("verbal");
		String exStr = "【経験】" + request.getParameter("experience");
		String verbalStr = "【言語】";
		if (verbalArray != null) {
			for (String verbal : verbalArray) {
				verbalStr += (verbal + " ");
			}
		} else {
			verbalStr += "【未選択】";
		}
		
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>                                 ");
		out.println("<html>                                          ");
		out.println("<head>                                          ");
		out.println("<meta charset=\"UTF-8\">                        ");
		out.println("<title>入力内容</title>                         ");
		out.println("<link rel=\"stylesheet\" href=\"style.css\">    ");
		out.println("</head>                                         ");
		out.println("<body>                                          ");
		out.println("    <h2>入力内容</h2>                           ");
		out.println("    " + nameStr + "<br><br>                     ");
		out.println("    " + verbalStr + "<br><br>                 ");
		out.println("    " + exStr + "<br><br>                   ");
		out.println("<br><a href=\"input.html\">入力フォームへ</a>   ");
		out.println("</body>                                         ");
		out.println("</html>                                         ");
		
				
	}

}
