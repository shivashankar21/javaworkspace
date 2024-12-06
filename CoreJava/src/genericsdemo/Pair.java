package genericsdemo;
/**
* Author:Paspunoori.Shankar
* Date  :5 Nov 2024
* Time  :11:34:01 am
* Email :paspunoori.shankar@coforge.com
*/
// Generic class with 2 parameters - 
//Maps- Stores data in form of key & value pairs - Hashmap, TreeMap

public class Pair <T,U>{
	private T first;
	private U second;
	
	//Generate Constructor using fields 
	public Pair(T first, U second) {
		this.first = first;
		this.second = second;
	}
	
//Generate getters and setters
	
	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public U getSecond() {
		return second;
	}

	public void setSecond(U second) {
		this.second = second;
	}
	
	
	
	

}
