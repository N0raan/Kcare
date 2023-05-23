package AssistantConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kcare.Object.*;
import kcare.sqlConnection.*;

public class AssisStudentGroup {   // JDBC connection to get student group for assistant
	
public void getAssisStudentGroup (String Student_Id) {
	    
	    Student student = new Student (Student_Id);

	    try {
	      MySqlConnection dbConnection = MySqlConnection.getInstance();
	      Connection connection = dbConnection.getConnection();
	      PreparedStatement ps = connection.prepareStatement("SELECT Class_Id FROM student WHERE Student_Id=?");
	      ps.setString(1,student.getStudent_Id());
	      
	      ResultSet rs = ps.executeQuery();

	      while(rs.next()){
	                
	                student.setGroup((Group) rs.getStatement());
	             
	    	       
	                System.out.print("Group: "  + student.getGroup());
	               
	              
	            } 
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }
	    //return student;
	
	
	
}

}
