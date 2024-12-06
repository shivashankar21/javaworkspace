package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

/**
* Author:Paspunoori.Shankar
* Date  :5 Nov 2024
* Time  :12:39:24 pm
* Email :paspunoori.shankar@coforge.com
*/
public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		//generic arrayList
		
		ArrayList<String> a1=new ArrayList<String>();
		
		//add elements to arraylist and it maintains the order of insertion
		a1.add("Java");//Autoboxing
		a1.add("Perl");
		a1.add("C++");
		a1.add("C#  5.0");
		a1.add("Java");
		a1.add("Python");
		
		System.out.println(a1);
		
		//get elements by index
		
		System.out.println("Elements at index 1"+a1.get(1));
		
		System.out.println("Does List contains elements Java?: "+a1.contains("Java"));
		
		//add elements at specific index
		
		a1.add(2,"Oracle");
		System.out.println(a1);
		
		System.out.println("Is ArrayList Empty ?:" +a1.isEmpty());
		
		System.out.println("Index of Perl: "+a1.indexOf("Perl"));
		
		System.out.println("Size of ArrayList: "+a1.size());
		
		//collections is a utility Class
		
	Collections.sort(a1);
	System.out.println("ArrayList  after Sorting :" +a1);
	
	//a1.add(100);  //compile Error
	
	ArrayList<Integer> a2= new ArrayList<Integer>();
	
	a2.add(100);
	a2.add(500);
	a2.add(73);
	a2.add(66);
	a2.add(350);
	a2.add(73);
	
	
	System.out.println(a2);
	System.out.println("Size : " +a2.size());
		
		
		
	}
	
	
	
	
}
