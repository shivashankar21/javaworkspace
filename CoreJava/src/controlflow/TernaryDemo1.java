
package controlflow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* Author:Paspunoori.Shankar
* Date  :24 Oct 2024
* Time  :11:47:29 am
* Email :paspunoori.shankar@coforge.com
*/
public class TernaryDemo1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int a , b,result;
		
		
		System.out.println("Enter 2 numbers: ");
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		
		String msg = (a>b)?"a is greatest" : "b is greatest";
		System.out.println(msg);
		result = (a>b )? a:b;
		System.out.println("the maximum of 2 numbers is "+result);

		}

}
