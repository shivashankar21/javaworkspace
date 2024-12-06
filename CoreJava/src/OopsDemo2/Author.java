package OopsDemo2;
/**
* Author:Paspunoori.Shankar
* Date  :29 Oct 2024
* Time  :10:14:51 am
* Email :paspunoori.shankar@coforge.com
* 
* Aggregation Example 
*/
public class Author {
	String authorName;
	int age;
	String place;
	
	
	public Author(String authorName, int age, String place) {
		this.authorName = authorName;
		this.age = age;
		this.place = place;
	}


	@Override
	public String toString() {
		return "Author [authorName=" + authorName + ", age=" + age + ", place=" + place + "]";
	}

	

}
