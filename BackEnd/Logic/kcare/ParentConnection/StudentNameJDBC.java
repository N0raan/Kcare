package ParentConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kcare.Object.*;
import kcare.SqlConnection.*;

public class StudentNameJDBC {
	
	
	
	public void getStudentName (String Student_Id) {
	    
	    Student student = new Student (Student_Id);

	    try {
	      MySqlConnection dbConnection = MySqlConnection.getInstance();
	      Connection connection = dbConnection.getConnection();
	      PreparedStatement ps = connection.prepareStatement("SELECT First_Name, Last_Name FROM student WHERE Student_Id=?");
	      ps.setString(1,student.getStudent_Id());
	      
	      ResultSet rs = ps.executeQuery();

	      while(rs.next()){
	                
	                student.setFirst_Name(rs.getString("First_Name"));
	    	       /* String First_Name= rs.getString("FirstName");
	                String Last_Name = rs.getString("LastName");*/
	                student.setLast_Name(rs.getString("Last_Name"));
	               
	                
	                System.out.print("FirstName: " + student.getFirst_Name());
	                System.out.print(", LastName: " + student.getLast_Name());
	              
	            } 
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }
	    //return student;
	    
	  }

}
