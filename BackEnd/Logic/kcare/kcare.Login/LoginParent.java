package kcare.Login;

import kcare.Object.*;
import kcare.Object.Parent;
import kcare.Object.Student;
import kcare.SqlConnection.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginParent {
	
	public Parent parent;
	public Student  student;
	private Connection conn;
	MySqlConnection dbconnection;

	
	// LoginDao
public boolean CheckLogin (String S_ID) {
		
		kcare_login log = new kcare_login(S_ID); 
		
		try {
			MySqlConnection dbConnection = MySqlConnection.getInstance();
			Connection connection = dbConnection.getConnection();
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM Student WHERE Student_Id=? ");
			ps.setString(1, log.getStudent_Id());
			//ps.setString(2, log.getUser_password());
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				System.out.print("Valid User");
				return true;
			} else {
				System.out.print("Invalid User");
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	
	
	public LoginParent(Student student) {
		super();
		this.student = student;
	}





	public boolean authenticate () {
		
		
		Connection conn=MySqlConnection.getConnection();
		MySqlConnection.
		
		try {
            // Prepare the SQL statement
            String sql = "SELECT name FROM students WHERE Student_Id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, student.getStudent_Id());

            // Execute the query
            ResultSet result = statement.executeQuery();

            // Retrieve the student name from the query result
            if (result.next()) {
                String First_Name = result.getString("name");
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("Error retrieving student name: " + ex.getMessage());
            
        }
		return false;
		
		
	}
	
	*/
	
	
	
	

}
