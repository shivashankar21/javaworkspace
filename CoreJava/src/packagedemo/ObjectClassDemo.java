package packagedemo;
/**
* Author:Paspunoori.Shankar
* Date  :4 Nov 2024
* Time  :4:52:03 pm
* Email :paspunoori.shankar@coforge.com
*/
public class ObjectClassDemo {
	public static void main(String[] args) {
		
		Person p1= new Person("Shiva",22);
		Person p2= new Person("Shiva",22);
		Person p3= new Person("Satyam",21);

		System.out.println("Person 1:"+p1.toString());
		
		System.out.println("Person 3:"+p3);
		
		System.out.println("Person1 equals Person2 :" +p1.equals(p2));
		System.out.println("Person2 equals Person3 :" +p2.equals(p3));
		
		System.out.println("Person 1 Hascode"+p1.hashCode());
		System.out.println("Person 2 Hascode"+p2.hashCode());
		
		System.out.println("Class of Person 1 : "+p1.getClass().getName());


		
	}

}
