package jdbcdemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
* Author:Paspunoori.Shankar
* Date  :7 Nov 2024
* Time  :2:59:53 pm
* Email :paspunoori.shankar@coforge.com
*/
public class InsertDemo {
	
	public static void main(String[] args) {
		
		Connection con=null;
		Statement stmt;
		ResultSet rs;
		int count;
		
		try {
			
			
			con =ConnectionUtil.createConnection();

			String str = "insert into skills(name) values ('Angular')";
			stmt=con.createStatement();
			
			count=stmt.executeUpdate(str);
			
			if(count>0) {
				System.out.println("Records Inserted Scuccesfully");
			}
			
			String str1="SELECT COUNT(id) from skills";
					rs=stmt.executeQuery(str1);
			int cnt=0;
			
			while (rs.next()) {
				cnt=rs.getInt(1);
				
			}
			System.out.println("Total no of records: "+cnt );
		}
		catch(Exception e) {
			System.out.println(e);

		}
		
		
	}

}
