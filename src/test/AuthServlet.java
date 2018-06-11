package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AuthServlet
 */
@WebServlet("/AuthServlet")
public class AuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter writer = response.getWriter();
         
	        // build HTML code
	        String htmlRespone = "<html>";
	        htmlRespone += "<header><title>test</title></header>"; 
	        htmlRespone += "<body><h2>Your username is: "+request.getSession().getAttribute("username") + "<br/></body>";      
	         
	        htmlRespone += "</html>";
	         System.out.println(request.getSession().getMaxInactiveInterval());
	        // return response
	        writer.println(htmlRespone);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter writer = response.getWriter();
         
	        // build HTML code
	        String htmlRespone = "<html>";
	        htmlRespone += "<header><title>test</title></header>"; 
	        htmlRespone += "<body><h2>Your username is: "+request.getSession().getAttribute("username") + "<br/></body>";      
	         
	        htmlRespone += "</html>";
	         
	        // return response
	        writer.println(htmlRespone);
	}

}
