package test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		System.out.println("username :"+request.getParameter("username"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
//		System.out.println("username :"+request.getParameter("username"));
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		if (password.equals("456")) {
			/**
			 * getcontextpath return the project name
			 */
//			response.sendRedirect(request.getContextPath()+"/profile/userprofile.html");
//			System.out.println(username);
			HttpSession session=request.getSession();
			session.setAttribute("username",username );
			RequestDispatcher rds= request.getRequestDispatcher("AuthServlet");
//			rds.forward(request, response);
//			rds.include(request, response);
			
			response.sendRedirect(request.getContextPath()+"/AuthServlet");
//			System.out.println(session.getId());
		
		}else
		{
			response.sendRedirect("index.html");
		}
		
		
	}

}
