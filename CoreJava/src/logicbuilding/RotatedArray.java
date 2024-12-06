package logicbuilding;
import java.util.Scanner;

/**
* Author:Paspunoori.Shankar
* Date  :15 Nov 2024
* Time  :11:58:45 pm
* Email :paspunoori.shankar@coforge.com
*/

public class RotatedArray {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
 
		System.out.print("Enter n value: ");
		int n = scanner.nextInt();
		System.out.print("Enter k value: ");
		int k = scanner.nextInt();
 
		int[] arr = new int[n];
		System.out.println("Enter the array elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
 
		//rotate by k % n steps
		k %= n;
 
		reverse(arr, 0, n - 1);
		reverse(arr, 0, k - 1);
		reverse(arr, k, n - 1);
 
		System.out.println("Rotated Array:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
 
		scanner.close();
	}
 
	private static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
 
