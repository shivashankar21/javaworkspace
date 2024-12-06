package jdbcdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
* Author:Paspunoori.Shankar
* Date  :7 Nov 2024
* Time  :4:19:16 pm
* Email :paspunoori.shankar@coforge.com
*/
public class DeleteDemo {
	public static void main(String[] args) {
		
		Connection con=null;
		Statement stmt;
		ResultSet rs;
		 int cnt=0;
		try {
			con=ConnectionUtil.createConnection();
			String sql="Delete from candidates where rtrim (last_name)"+"LIKE \'k%g\';";
			
			String sql1= "delete FRom candidates where id = 101;";
			
			
			stmt=con.createStatement();
			cnt=stmt.executeUpdate(sql);
			if(cnt>0) {
				System.out.println(cnt+" Records are deleted");
			}
			else {
				System.out.println("Records not found ");
			}
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
