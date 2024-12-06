package controlflow;
/**
* Author:Paspunoori.Shankar
* Date  :25 Oct 2024
* Time  :9:47:43 am
* Email :paspunoori.shankar@coforge.com
* 
* program to demonstarte continue statement
*/
public class Jump10 {
	public static void main(String[] args) {
		int i;
		
		System.out.println("**********Break Statement Demo***********");
		for (i = 0; i <=10; i++) {
			if (i==5) break;
			System.out.println(i);
			}
		System.out.println("**********Continue statement Demo*********");
		for( i =1;i<=10; i++) {
			if(i>4 && i<9) continue;
			
			System.out.println(i);
			}
			
		
	}

}
