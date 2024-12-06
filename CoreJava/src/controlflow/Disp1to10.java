package controlflow;
/**
* Author:Paspunoori.Shankar
* Date  :24 Oct 2024
* Time  :2:40:59 pm
* Email :paspunoori.shankar@coforge.com
* 
* program to display numbers freom 1 to 10 and 10 to 1
*/
public class Disp1to10 {
	public static void main(String[] args) {
		 //loop intialization 
		int i=1;
		// set conditioon to loop 
		System.out.println("************forward loop**********");
		while(i<=10) {
			System.out.println(i+"  -JAMES GOSLING  ");
			
			// increment the loop
			i=i+1;
			
		}
		System.out.println("*************Reverse Loop**********");
		
		int j =20;
		while (j>=1) {
			System.out.print(j+"\t");
			j=j-1;
		}
		
	}
}
