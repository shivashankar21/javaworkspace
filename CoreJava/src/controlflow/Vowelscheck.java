package controlflow;

import java.util.Scanner;

/**
 * Author:Paspunoori.Shankar
 * Date  :25 Oct 2024
 * Time  :9:21:11 am
 * Email :paspunoori.shankar@coforge.com
 */
public class Vowelscheck {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		String sentence;

		System.out.println("Enter a sentence : ");
		sentence=scanner.nextLine();

		String sentence1=sentence.toLowerCase();
		int count=0;
		scanner.close();

		for (int i=0; i <sentence.length();i++) {
			if (sentence1.charAt(i)=='a'||sentence1.charAt(i)=='e'||sentence1.charAt(i)=='o'||sentence1.charAt(i)=='i'||sentence1.charAt(i)=='u') {
				count=count+1;
			}
		}
		System.out.println("The Total number of vowels in \""+sentence+"\" is :"+count);
	}

}