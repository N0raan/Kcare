package ParentServlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import ParentConnection.*;
import kcare.login.*;


/**
 * Servlet implementation class ParentServletsStudentName
 */
public class ParentServletsStudentName extends HttpServlet {
	private static final long serialVersionUID = 1L;
		
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ParentServletsStudentName() {
        super();
        // TODO Auto-generated constructor stub
    }

      
      public void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    	  
    	// Set response content type
          response.setContentType("text/html");
          
    	  LoginParent ss = new LoginParent();
    	  StudentNameJDBC xx = new StudentNameJDBC();
    	  
    	  
    	  
    	  String StudentID=ss.SIDvariable();
        
        

        // Retrieve student name using JDBC
         xx.getStudentName(StudentID);

        
      }
    }

