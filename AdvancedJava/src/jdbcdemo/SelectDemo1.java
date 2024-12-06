package jdbcdemo;

import java.sql.*;
/**
* Author:Paspunoori.Shankar
* Date  :7 Nov 2024
* Time  :12:12:16 pm
* Email :paspunoori.shankar@coforge.com
*/
//Demonstrate projection 
public class SelectDemo1 {
	
	public static void main(String[] args) {
		
		Connection con=null;
		Statement stmt;
		ResultSet rs;
		
		try {
			con=ConnectionUtil.createConnection();
			stmt=con.createStatement();
			
			rs=stmt.executeQuery("SELECT First_name, last_name,email from candidates order by last_name");
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString("last_name")+"\t"+rs.getString("email"));
			
			
		}
		con.close();
		
		}
		
	
	catch(Exception e) {
		System.out.println(e);
	}
	
}
	
                           



}
