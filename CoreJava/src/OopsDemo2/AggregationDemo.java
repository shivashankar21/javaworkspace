package OopsDemo2;
/**
* Author:Paspunoori.Shankar
* Date  :29 Oct 2024
* Time  :10:08:07 am
* Email :paspunoori.shankar@coforge.com
*/
public class AggregationDemo {
	public static void main(String[] args) {
		
		Address ad1=new Address("Bengaluru","Karnataka" , "India" , 566016);
		Address ad2=new Address("mangalooru","Karnataka" , "India" , 587023);
		
		Student s1=new Student(101," Ravi kumar", ad1);
		Student s2=new Student(102," Ravi kumar", ad2);
		
		
		s1.display();
		s2.display();


		
		
		
	}

}
