package CollectionsDemo;

import java.util.Comparator;
import java.util.TreeSet;

/**
* Author:Paspunoori.Shankar
* Date  :6 Nov 2024
* Time  :9:36:29 am
* Email :paspunoori.shankar@coforge.com
* 
* LinkedHashSet Stores unique elements in the form of insertion oder
 * HashSet Stores unique elements in the form of random order - better Performance
 * TreeSet Stores unique elements in the form of sorted Order
*/
public class TreeSetDemo1 {
	public static void main(String[] args) {
		 
		  // Creating a TreeSet
		        TreeSet<String> fruits = new TreeSet<>();

		        // Adding new elements to a TreeSet
		        fruits.add("Banana");
		        fruits.add("Apple");
		        fruits.add("Pineapple");
		        fruits.add("Orange");

		        System.out.println("Fruits Set : " + fruits);

		        // Duplicate elements are ignored
		        fruits.add("Apple");
		        System.out.println("After adding duplicate element \"Apple\" : " + fruits);

		        // This will be allowed because it's in lower case.
		        fruits.add("banana");
		        //fruits.add(null);
		        System.out.println("After adding \"banana\" : " + fruits);

		        // TreeSet of Integer Type
		        TreeSet<Integer> tset2 = new TreeSet<Integer>();

		        // Adding elements to TreeSet<Integer>
		        tset2.add(88);
		        tset2.add(7);
		        tset2.add(101);
		        tset2.add(0);
		        tset2.add(3);
		        tset2.add(222);

		        System.out.println("Tree set in Ascending Order :"+tset2);

		        // tree set with custom comparator
		        TreeSet<Integer> tset3 = new TreeSet<>(Comparator.reverseOrder());

		        tset3.add(88);
		        tset3.add(7);
		        tset3.add(101);
		        tset3.add(0);
		        tset3.add(3);
		        tset3.add(222);

		        System.out.println("Tree set in Reverse Order:"+tset3);
		
	
	}

}
