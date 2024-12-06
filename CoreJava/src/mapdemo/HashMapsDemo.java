package mapdemo;

import java.util.HashMap;
import java.util.Map;

/**
* Author:Paspunoori.Shankar
* Date  :6 Nov 2024
* Time  :10:16:53 am
* Email :paspunoori.shankar@coforge.com
*/
public class HashMapsDemo {
	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<Integer, String>();
		
		hm.put(111, "John");
		hm.put(222, "Jim");
		hm.put(444, "Mike");
		hm.put(null, "Jimmy");
		hm.put(null, "Jack");
		
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

		
	}

}
