package CollectionsDemo;

import java.util.Comparator;

/**
* Author:Paspunoori.Shankar
* Date  :6 Nov 2024
* Time  :12:22:37 pm
* Email :paspunoori.shankar@coforge.com
* 
* // comparator interface is used to sort objects user defined class 
// based on multiple fields
*/
public class Developer {
	
	private int id;
	private String name,domain;
	
	
	public Developer(int id, String name, String domain) {
		this.id = id;
		this.name = name;
		this.domain = domain;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getDomain() {
		return domain;
	}
	

}

class Idcomparator implements Comparator<Developer>{

	@Override
	public int compare(Developer o1, Developer o2) {
		Developer d1=(Developer) o1;
		Developer d2=(Developer) o2;
		
		if(d1.getId()==d2.getId())
			return 0;
		else if (d1.getId()>d2.getId())
			return 1;
		else
			return -1;
		
	}	
}

class DomainComparator implements Comparator<Developer>{

	@Override
	public int compare(Developer o1, Developer o2) {
		Developer d1=(Developer) o1;
		Developer d2=(Developer) o2;
		
		return d1.getDomain().compareTo(d2.getDomain());
		
		
	}
	
	
	
	
	
	
	
	
	
	
}