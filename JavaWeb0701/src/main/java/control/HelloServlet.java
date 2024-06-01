package control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/hello-servlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//レスポンスのコンテンツタイプおよびエンコーディング方式を指定
		response.setContentType("text/html; charset=UTF-8");

		//レスポンス書き出し用オブジェクトの取得
		PrintWriter out = response.getWriter();

		//レスポンスの書き出し
		out.println("<!DOCTYPE html>                                 ");
		out.println("<html>                                          ");
		out.println("<head>                                          ");
		out.println("<meta charset=\"UTF-8\">                        ");
		out.println("<title>自己紹介サーブレット</title>             ");
		out.println("<link rel=\"stylesheet\" href=\"style.css\">    ");
		out.println("</head>                                         ");
		out.println("<body>                                          ");
		out.println("    <h2>自己紹介</h2>                           ");
		out.println("    <p>こんにちは。たかはしみのるです。</p>     ");
		out.println("    <p>神奈川県出身。東京在住です。</p>         ");
		out.println("</body>                                         ");
		out.println("</html>                                         ");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
