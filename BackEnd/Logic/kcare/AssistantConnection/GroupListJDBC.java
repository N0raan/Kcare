package AssistantConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kcare.Object.*;
import kcare.sqlConnection.*;

public class GroupListJDBC {
public void getGroupList (String AssistantID ) {
	
	Assistant assistant = new Assistant (AssistantID);

	    
	    

	    try {
	      MySqlConnection dbConnection = MySqlConnection.getInstance();
	      Connection connection = dbConnection.getConnection();
	      PreparedStatement ps = connection.prepareStatement("SELECT First_Name, Last_Name FROM assistant INNER JOIN student ON Assistant.Assistant_Id = Student.Assistant_Id WHERE Student.Student_Id = ?");
	      ps.setString(1,student.getStudent_Id());
	      
	      ResultSet rs = ps.executeQuery();

	      while(rs.next()){
	                
	               
	    	        student.setAssistant((Assistant) rs.getStatement());
	                System.out.print("Assistant: "  + student.getAssistant());
	               
	              
	            } 
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }
	    //return student;
	
	
	

}
