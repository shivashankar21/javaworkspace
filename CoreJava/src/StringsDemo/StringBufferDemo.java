package StringsDemo;
/**
 * Author:Paspunoori.Shankar
 * Date  :4 Nov 2024
 * Time  :12:58:09 pm
 * Email :paspunoori.shankar@coforge.com
 * 
 * Program to demonstrate StringBuffer Methods - It is a Mutable String Class
 * StringBuffer can be used in Multi Thread Applications.
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer buf=new StringBuffer("Java");

		System.out.println("The Original String Buffer Object :"+buf);

		buf.append(" Guide Ver1/"); // append // Java Guide Ver1/7
		buf.append(7);
		System.out.println(buf);

		int index = 5;   // Insert  // Java Student Guide Ver1/7
		buf.insert(index, "Student ");
		System.out.println(buf);

		index = buf.indexOf("/",0);      // Set  // Java Student Guide Ver1.7
		buf.setCharAt(index, '.');
		System.out.println(buf);

		int start = 24;   // Replace  // Java Student Guide Ver1.8
		int end = 25;
		buf.replace(start, end, "8");
		String s = buf.toString();   //Convert to string
		System.out.println(s);
		System.out.println(buf.reverse());

		buf=new StringBuffer(); // Clear the StringBuffer
		System.out.println("Cleared StringBuffer :"+buf);

	}




}
