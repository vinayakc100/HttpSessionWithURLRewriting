package HttpSessionWithURLRewriting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SetSession
 */
@WebServlet("/set")
public class SetSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SetSession() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s1=request.getParameter("book1");
		String s2=request.getParameter("book2");
		String s3=request.getParameter("book3");
		HttpSession hs=request.getSession();
		hs.setAttribute("b1", s1);
		hs.setAttribute("b2", s2);
		hs.setAttribute("b3", s3);
		String s=response.encodeURL("get");
		PrintWriter pw=response.getWriter();
		pw.println("<html><body bgcolor=cyan text=red>");
		pw.println("<h1>Your Books Are Added To Cart</h1>");
		pw.println("<a href="+s+">Next</a>");
		pw.println("</body></html>");
	}

}
