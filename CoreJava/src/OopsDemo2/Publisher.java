package OopsDemo2;
/**
* Author:Paspunoori.Shankar
* Date  :29 Oct 2024
* Time  :10:16:25 am
* Email :paspunoori.shankar@coforge.com
* 
* Aggregation Example
*/
public class Publisher {
	
	String name;
	String publisherID;
	String city;
	
	
	@Override
	public String toString() {
		return "Publisher [name=" + name + ", publisherID=" + publisherID + ", city=" + city + "]";
	}


	public Publisher(String name, String publisherID, String city) {
		this.name = name;
		this.publisherID = publisherID;
		this.city = city;
	}
	
	


}
