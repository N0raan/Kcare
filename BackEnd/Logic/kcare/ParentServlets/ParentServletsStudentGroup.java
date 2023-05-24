package ParentServlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kcare.login.LoginParent;

import java.io.IOException;

import ParentConnection.*;

/**
 * Servlet implementation class ParentServletsStudentGroup
 */
public class ParentServletsStudentGroup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ParentServletsStudentGroup() {
        super();
        // TODO Auto-generated constructor stub
    }


    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      	  
      	// Set response content type
            response.setContentType("text/html");
            
      	  LoginParent ss = new LoginParent();
      	  StudentGroupJDBC xx = new StudentGroupJDBC();
      	  
      	  
      	  
      	  String StudentID=ss.SIDvariable();
          
          

          // Retrieve student name using JDBC
           xx.getStudentGroup(StudentID);

          
        }

}
