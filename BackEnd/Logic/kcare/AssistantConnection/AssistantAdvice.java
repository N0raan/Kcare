package AssistantConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kcare.Object.*;
import kcare.sqlConnection.*;
public class AssistantAdvice {
public void getAssistantAdvice (String Student_Id) {
	    
	    Student student = new Student (Student_Id);

	    try {
	      MySqlConnection dbConnection = MySqlConnection.getInstance();
	      Connection connection = dbConnection.getConnection();
	      PreparedStatement ps = connection.prepareStatement("SELECT Advice FROM student WHERE Student_Id=?");
	      ps.setString(1,student.getStudent_Id());
	      
	      ResultSet rs = ps.executeQuery();

	      while(rs.next()){
	                
	                student.setAdvice(rs.getString("Advice"));
	    	     
	                
	                System.out.print("Advice:  "  + student.getAdvice());
	               
	              
	            } 
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }
	    //return student;

}

}
