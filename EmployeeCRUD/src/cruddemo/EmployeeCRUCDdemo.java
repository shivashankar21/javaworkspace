package cruddemo;

import java.util.Scanner;

/**
* Author:Paspunoori.Shankar
* Date  :8 Nov 2024
* Time  :9:14:07 am
* Email :paspunoori.shankar@coforge.com
*/
	public class EmployeeCRUCDdemo{
		 
		public static void main(String[] args) {
			Employee e=new Employee();
			String city=null,name=null,contactno=null;
			int cid=0;;
	 
			System.out.println("************** Coforge  **************");
			System.out.println("----------- Employee Management System ----------");
			while(true)
			{
				System.out.println("Press 1 for New Employee \t Press 2 to Display Employees");
				System.out.println("Press 3 for Update Employee \t Press 4 to Delete Employee");
				System.out.println("Press 5 to Update Email using ResultSet");
				System.out.println("Press 6 for Exit");

	 
				Scanner s=new Scanner(System.in);
				int option=s.nextInt();
	 
				switch(option)
				{
				case 1: System.out.println("Enter Employee Name: ");
				        name = s.next();
				        System.out.println("Enter City: ");
				        city = s.next();
				        System.out.println("Enter Contact No: ");
				        contactno = s.next();
				        e.insertEmployee(name, city, contactno);
				        break;
				
	 
				case 2: e.getEmployee();
				        break;
	 
				case 3: System.out.println("Enter Employee ID to Update: ");
	                    cid= s.nextInt();
	                    s.nextLine();
	                    System.out.println("Enter New City: ");
	                    city = s.nextLine();
	                    e.updateEmployee(cid, city);
	                    break;
	                    
	 
				case 4: System.out.println("Enter Employee Id  to be Deleted:");
				        cid = s.nextInt();
				        e.deleteEmployee(cid);
				        break;
				        
				
		       
		        
				case 6: System.out.println("Program Terminated");
				        s.close();
				        System.exit(0);
	 
				default: System.out.println("Invalid Selection");
				         break;
	 
				}
			}
		}
	}


