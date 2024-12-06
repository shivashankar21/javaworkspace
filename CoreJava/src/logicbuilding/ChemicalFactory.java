package logicbuilding;

import java.util.Arrays;

import java.util.Scanner;
/**
* Author:Paspunoori.Shankar
* Date  :15 Nov 2024
* Time  :11:39:39 pm
* Email :paspunoori.shankar@coforge.com
*/


 

public class ChemicalFactory {
 
	public static int countExplosivePairs(String[] chemicals) {

		int explosiveCount = 0;
 
		for (int i = 0; i < chemicals.length; i++) {

			String doubledChemical = chemicals[i] + chemicals[i];

			char[] sortedDoubled = doubledChemical.toCharArray();

			Arrays.sort(sortedDoubled);

			String sortedDoubledStr = new String(sortedDoubled);
 
			for (int j = i + 1; j < chemicals.length; j++) {

				char[] sortedChemical = chemicals[j].toCharArray();

				Arrays.sort(sortedChemical);

				String sortedChemicalStr = new String(sortedChemical);
 
				if (sortedDoubledStr.equals(sortedChemicalStr)) {

					explosiveCount++;

				}

			}

		}

		return explosiveCount;

	}
 
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number of chemicals: ");

		int n = scanner.nextInt();

		scanner.nextLine(); // Consume newline

		String[] chemicals = new String[n];
 
		System.out.println("Enter the chemicals:");

		for (int i = 0; i < n; i++) {

			chemicals[i] = scanner.nextLine();

		}
 
		int result = countExplosivePairs(chemicals);

		System.out.println("Number of explosive pairs: " + result);
 
		scanner.close();

	}

}

 

