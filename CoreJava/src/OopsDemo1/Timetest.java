package OopsDemo1;
/**
* Author:Paspunoori.Shankar
* Date  :26 Oct 2024
* Time  :3:35:23 pm
* Email :paspunoori.shankar@coforge.com
*/
public class Timetest {
	public static void main(String[] args) {
		Time t1 =new Time(12, 45, 55);
		Time t2 =new Time(10, 30, 30);
		
		t1.Add(t2);
		t1.display();

	}

}
