package controlflow;
/**
* Author:Paspunoori.Shankar
* Date  :25 Oct 2024
* Time  :10:04:23 am
* Email :paspunoori.shankar@coforge.com
*/
public class NestedLoopDemo {
	public static void main(String[] args) {
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("*"+"\t");
			}
			System.out.println();
		}
		System.out.println("------------------------------");
		
		
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*"+"\t");
			}
			System.out.println();
		}
		System.out.println("------------------------------");
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
		System.out.println("------------------------------");
		
	}

}
