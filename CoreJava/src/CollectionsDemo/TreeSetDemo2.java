package CollectionsDemo;

import java.util.TreeSet;

/**
* Author:Paspunoori.Shankar
* Date  :6 Nov 2024
* Time  :9:42:29 am
* Email :paspunoori.shankar@coforge.com
*/
public class TreeSetDemo2 {
	public static void main(String[] args) {
		//sorts the elements by ignoring the case.
        TreeSet<String> students = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

        students.add("Julia");
        students.add("Robert");
        students.add("Mark");
        students.add("Steven");
        students.add("mike");
        students.add("Mike");

        System.out.println("Students TreeSet : " + students);

        // Finding the size of a TreeSet
        System.out.println("Number of elements in the TreeSet : " + students.size());

        // Check if an element exists in the TreeSet
        String name = "Julia";
        if(students.contains(name)) {
            System.out.println("TreeSet contains the element : " + name);
        } else {
            System.out.println("TreeSet does not contain the element : " + name);
        }

        // Navigating through the TreeSet
        System.out.println("First element : " + students.first());
        System.out.println("Last element : " + students.last());

        name = "Robert";
        System.out.println("Element just greater than "  + name + " : " + students.higher(name));
        System.out.println("Element just lower than "  + name + " : " + students.lower(name));
		
		
	}

}
