package ParentConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import kcare.Object.*;
import kcare.sqlConnection.*;

public class ParentNumberJDBC {
	
public void getParentPhoneNumber (String Student_Id) {
	    
	    Student student = new Student (Student_Id);

	    try {
	      MySqlConnection dbConnection = MySqlConnection.getInstance();
	      Connection connection = dbConnection.getConnection();
	      PreparedStatement ps = connection.prepareStatement("SELECT Phone_number FROM student WHERE Student_Id=?");
	      ps.setString(1,student.getStudent_Id());
	      
	      ResultSet rs = ps.executeQuery();

	      while(rs.next()){
	                student.setParent((Parent) rs.getStatement());
	                
	    	       
	                System.out.print("Parent Phone Number "  + student.getParent());
	               
	              
	            } 
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }
	    //return student;
	
	
	
}

}
