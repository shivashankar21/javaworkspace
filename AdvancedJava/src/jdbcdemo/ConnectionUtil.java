package jdbcdemo;

import java.sql.*;

/**
* Author:Paspunoori.Shankar
* Date  :7 Nov 2024
* Time  :12:08:28 pm
* Email :paspunoori.shankar@coforge.com
*/

//utility class to connect mySql server
public class ConnectionUtil {
	
	public static Connection createConnection() throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","cfg@1234");
		return con;
	}

}
