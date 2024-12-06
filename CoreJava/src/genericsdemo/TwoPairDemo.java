package genericsdemo;

import java.util.Scanner;

/**
 * Author:Paspunoori.Shankar
 * Date  :5 Nov 2024
 * Time  :11:37:31 am
 * Email :paspunoori.shankar@coforge.com
 */
public class TwoPairDemo {
	public static void main(String[] args) {

		Pair<String,Integer> p1= new Pair<String, Integer>("The Car guys",8);

		Scanner s = new Scanner(System.in);

		System.out.println("Our current rating for "+p1.getFirst()+"is: "+p1.getSecond());

		System.out.println("How would you rate them? :");

		int score = s.nextInt();

		p1.setSecond(score);

		System.out.println("Our new rating for "+p1.getFirst() + " is : "+p1.getSecond());

		Pair<String , Float > p2= new Pair<String,Float >("Troy",8.5f);
		System.out.println("Our Current Rating for "+p2.getFirst() + " is : "+p2.getSecond());

		System.out.println("How would you rate them ?:");
		float score1 =s.nextFloat();

		p2.setSecond(score1);

		System.out.println("Our New Rating for "+p2.getFirst() + " is : "+p2.getSecond());

s.close();
	}

}
