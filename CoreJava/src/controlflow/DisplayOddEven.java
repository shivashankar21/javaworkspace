package controlflow;
/**
* Author:Paspunoori.Shankar
* Date  :24 Oct 2024
* Time  :3:24:49 pm
* Email :paspunoori.shankar@coforge.com
*/
public class DisplayOddEven {
	public static void main(String[] args) {
		int i=1;
		System.out.println("odd    even");
		System.out.println("---    ----");
		
		while(i<=10) {
			if (i%2==1) {
				System.out.print(i+"\t ");
			}
			
			else {
				System.out.println(i);
			}
			i=i+1;
			
			
		}
	}

}
