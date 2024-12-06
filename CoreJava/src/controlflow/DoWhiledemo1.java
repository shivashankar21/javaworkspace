package controlflow;
/**
* Author:Paspunoori.Shankar
* Date  :24 Oct 2024
* Time  :4:20:57 pm
* Email :paspunoori.shankar@coforge.com
*/
public class DoWhiledemo1 {
	public static void main(String[] args) {
		int i=1;
		//Do while Loop executes at least once , even if condition is false
		do {
			System.out.println(i);
			i=i+1;
		}
		while(i>5);
		System.out.println("Loop Terminated");
	}

}
