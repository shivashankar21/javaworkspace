package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
* Author:Paspunoori.Shankar
* Date  :5 Nov 2024
* Time  :2:17:23 pm
* Email :paspunoori.shankar@coforge.com
*/
public class ArrsyListDemo2 {
	public static void main(String[] args) {
		 ArrayList<String> names =new ArrayList<>();

	        names.add("James"); //AutoBoxing
	        names.add("Mary");
	        names.add("Micheal");
	        names.add("Jim");
	        names.add("Robert");
	        names.add("Mary");


	        System.out.println("Display ArrayList as List Without Loop :"+names);

	        System.out.println("********* Display Collection Objects using Classic For Loop ************");
	        
	        for (int i =0; i< names.size();i++) {
	        	System.out.println(names.get(i));
	        }
	 //manipulations 
	        names.add(3,"Shiva");
	        names.remove(0);
	        names.set(1, "Goslinig");
	        
	        System.out.println("***********Display collection  Objects using for each loop*************");
	        
	        for (String i:names) {
	        	System.out.println(i);
	        }
	        
	        ArrayList<Double> marks =new ArrayList<>();

	        marks.add(99.55);
	        marks.add(55.00);
	        marks.add(35.60);
	        marks.add(74.15);
	        marks.add(82.45);
	        
	        System.out.println("***********Display Collection Objects using interior Iterator************* ");
	        
	        //Create Iterator object for iteration in marks arrayList
	        
	        Iterator<Double> itr= marks.iterator();
	        while (itr.hasNext()) {
	        	System.out.println(itr.next());
	        }
	        
	        
	        //collections utility class functions 
	        
	        Collections.sort(marks);
	        System.out.println("The Marks ArrayList After Sorting : "+marks);
	        
	        Collections.reverse(marks);
	        System.out.println("The Marks ArrayList After Reversing: "+marks);
	        
	        System.out.println("Maximum marks: "+Collections.max(marks));
	        System.out.println("Minimum marks: "+Collections.min(marks));

	        

	        
	        
	        
	        
	        
	        
	}

}
