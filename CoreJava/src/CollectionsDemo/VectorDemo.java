package CollectionsDemo;

import java.util.Vector;

/**
 * Author:Paspunoori.Shankar
 * Date  :5 Nov 2024
 * Time  :3:12:19 pm
 * Email :paspunoori.shankar@coforge.com
 */


class PreciousStones{

	Vector<String> preciousVector;

	PreciousStones(){
		preciousVector=new Vector<String>();
	}

	void add() {
		preciousVector.addElement("Jade");
		preciousVector.addElement("Topaz");
		preciousVector.addElement("Turquoise");
		preciousVector.addElement("Emerald");
	}
	void insert() {
		preciousVector.insertElementAt("Diamond" , 0);
		preciousVector.insertElementAt("Opal" , 4);
	}

	void search() {
		System.out.println("***************************");
		System.out.println("Searching Contents :");
		System.out.println("***************************");
		String searchStone = "Diamond";
		if (preciousVector.contains(searchStone)) {
			System.out.println("Found " + searchStone
					+ " at index " + preciousVector.indexOf(searchStone));
		}
	}
	void otherDetails() {
		System.out.println("\nFirst Element = "
				+ preciousVector.firstElement());
		System.out.println("Default Capacity = "
				+ preciousVector.capacity());
		System.out.println("Last Element = "
				+ preciousVector.lastElement());
	}

	void display()
	{
		System.out.println(preciousVector);
	}

}
public class VectorDemo {
	public static void main(String[] args) {
		
		PreciousStones v = new PreciousStones();
		
		v.add();
		v.display();
		v.insert();
		v.display();
		v.search();
		v.otherDetails();
		v.display();

	}
}
