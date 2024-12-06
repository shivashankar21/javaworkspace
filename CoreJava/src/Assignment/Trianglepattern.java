package Assignment;
/**
* Author:Paspunoori.Shankar
* Date  :16 Nov 2024
* Time  :12:03:06 am
* Email :paspunoori.shankar@coforge.com
*/

 
public class Trianglepattern {
	public static void main(String[] args) {
		for (int i=1; i <=5; i++) {
			for(int j =1; j <= 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=4; i >=1; i--) {
			for(int j =1; j <= 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
 
		}
	}
}
 
 

