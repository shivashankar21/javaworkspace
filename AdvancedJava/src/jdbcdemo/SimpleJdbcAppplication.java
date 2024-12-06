package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

/**
* Author:Paspunoori.Shankar
* Date  :7 Nov 2024
* Time  :10:50:04 am
* Email :paspunoori.shankar@coforge.com
*/
public class SimpleJdbcAppplication {
	public static void main(String[] args) {
		
		try {
			//load the JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//establish the connection
			String url ="jdbc:mysql://localhost:3306/classicmodels";
			String username="root";
			String password="cfg@1234";
			Connection connection =DriverManager.getConnection(url,username,password);
			
			//Execute the query
			Statement statement = connection.createStatement();
			String sql="Select * from employees";
		    ResultSet resultset  = statement.executeQuery(sql);	
		    
	    	System.out.println("Employee ID \t firstName \t Designation ");

		    //process the results
		    while(resultset.next()) {
		    	int id =resultset.getInt("employeeNumber");
		    	String name= resultset.getString("firstName");
		    	System.out.println(id+"\t\t"+name+"\t\t"+resultset.getString(8));
		    }
		    
		    //close the resources
		    
		    resultset.close();
		    statement.close();
		    connection.close();
		    		    
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
