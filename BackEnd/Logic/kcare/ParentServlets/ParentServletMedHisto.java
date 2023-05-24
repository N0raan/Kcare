package ParentServlets;

import jakarta.servlet.ServletException;

import ParentConnection.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kcare.login.LoginParent;

import java.io.IOException;

import ParentConnection.StudentGroupJDBC;

/**
 * Servlet implementation class ParentServletMedHisto
 */
public class ParentServletMedHisto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ParentServletMedHisto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
		   public void doGet(HttpServletRequest request, HttpServletResponse response)
		            throws ServletException, IOException {
		      	  
		      	// Set response content type
		            response.setContentType("text/html");
		            
		      	  LoginParent ss = new LoginParent();
		      	  MedicalHistoryJDBC xx = new MedicalHistoryJDBC();
		      	  
		      	  
		      	  
		      	  String StudentID=ss.SIDvariable();
		          
		          

		          // Retrieve student name using JDBC
		           xx.getStudentMedicalHistory(StudentID);

		          
		        }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
