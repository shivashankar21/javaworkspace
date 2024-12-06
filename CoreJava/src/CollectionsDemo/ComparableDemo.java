package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

/**
* Author:Paspunoori.Shankar
* Date  :6 Nov 2024
* Time  :12:06:09 pm
* Email :paspunoori.shankar@coforge.com
*/
public class ComparableDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Student> al=new ArrayList<Student>();
		
		al.add(new Student(111,"john",21));
		al.add(new Student(222,"mary",22));
		al.add(new Student(311,"joseph",20));
		
		
		Collections.sort(al);
		for(Student o:al) {
			System.out.println(o.getRollno()+" "+o.getName()+" "+o.getAge());
			
		}

		
		
	}

}
