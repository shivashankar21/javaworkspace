package OopsDemo2;
/**
* Author:Paspunoori.Shankar
* Date  :28 Oct 2024
* Time  :10:33:27 am
* Email :paspunoori.shankar@coforge.com
*/
public class SingleInheritanceDemo {
	public static void main(String[] args) {
		Developer d1=new Developer(1111, "shiva" , 50000,"JDBC");
		Developer d2=new Developer(2222, "iva" , 30000,"Spring Framework");
		Developer d3=new Developer(3333, "sheela" , 17000,"Spring Framework");
		
		d1.display();
		d1.displayDeveloperDetails();
		
		d2.display();
		d2.displayDeveloperDetails();
		
		d3.display();
		d3.displayDeveloperDetails();
		
		Employee employee1=new Employee(888,"Michael John",3500);
		Employee employee2=new Employee(9878,"John",36787);
		
		System.out.println("*********************Normal Employee Details*************");
		employee1.display();
		employee2.display();

		
		
		

	}

}
