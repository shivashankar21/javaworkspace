package cruddemo;

import java.sql.*;
/**
* Author:Paspunoori.Shankar
* Date  :7 Nov 2024
* Time  :5:11:25 pm
* Email :paspunoori.shankar@coforge.com
*/
		 
		//Employee class to implement CRUD Operation
public class Employee {
				Connection con;
				PreparedStatement ps;
				Statement st;
				ResultSet rs;
		 
				public Connection getConnection()
				{
					 try {
				            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "cfg@1234");
				        } catch (Exception ex) {
				            ex.printStackTrace();
				        }
				        return con;
				}
		 
				public void insertEmployee(String name, String city, String contact)
				{
					try {
			            con = getConnection();
			            String query = "INSERT INTO employees (name, city, contact) VALUES (?, ?, ?)";
			            ps = con.prepareStatement(query);
			            ps.setString(1, name);
			            ps.setString(2, city);
			            ps.setString(3, contact);
			            ps.executeUpdate();
			            System.out.println("** Employee Inserted **");
			        } catch (SQLException ex) {
			            ex.printStackTrace();
			        }
		 
				}
		 
				public void getEmployee()
				{
					try {
			            con = getConnection();
			            String query = "SELECT * FROM employees";
			            st = con.createStatement();
			            rs = st.executeQuery(query);
			            System.out.println("** Display Employees **");
			            while (rs.next()) {
			                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") +
			                                   ", City: " + rs.getString("city") + ", Contact: " + rs.getString("contact"));
			            }
			        } catch (SQLException ex) {
			            ex.printStackTrace();
			        }
				}
		 
				public void updateEmployee(int id,String city)
				{
					try {
			            con = getConnection();
			            String query = "UPDATE employees SET city = ? WHERE id = ?";
			            ps = con.prepareStatement(query);
			            ps.setString(1, city);
			            ps.setInt(2, id);
			            ps.executeUpdate();
			            System.out.println("** Employee Updated **");
			        } catch (SQLException ex) {
			            ex.printStackTrace();
			        }
				}
		 
				public void deleteEmployee(int id)
				{
					try {
			            con = getConnection();
			            String query = "DELETE FROM employees WHERE id = ?";
			            ps = con.prepareStatement(query);
			            ps.setInt(1, id);
			            ps.executeUpdate();
			            System.out.println("** Employee Deleted **");
			        } catch (SQLException ex) {
			            ex.printStackTrace();
			        }
				}

			
						
					
				}
		 
		 
				
			
			
			
		 
		 
		 

