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
 * Servlet implementation class GetSession
 */
@WebServlet("/get")
public class GetSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetSession() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession hs=request.getSession();
		String s1=(String)hs.getAttribute("b1");
		String s2=(String)hs.getAttribute("b2");
		String s3=(String)hs.getAttribute("b3");
		PrintWriter pw=response.getWriter();
		pw.println("<html><body bgcolor=red text=yellow>");
		pw.println("<h1><u>Selected Books</u></h1>");
		if(s1!=null)
		{
		pw.println(s1+"<br>");
		}
		if(s2!=null)
		{
		pw.println(s2+"<br>");
		}
		if(s3!=null)
		{
		pw.println(s3+"<br>");
		}
		pw.println("</body></html>");
	}

}
