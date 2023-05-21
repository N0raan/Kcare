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
	
	
