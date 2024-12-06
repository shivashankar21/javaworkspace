package logicbuilding;
/**
* Author:Paspunoori.Shankar
* Date  :16 Nov 2024
* Time  :12:00:08 am
* Email :paspunoori.shankar@coforge.com
*/

 
public class TelephoneBill {
 
	public static int[] calculateBill(int[] callMinutes, int budget) {
		int localCost = (int) (callMinutes[0] * 0.25);
		int stdCost = callMinutes[1] * 1;
		int isdCost = callMinutes[2] * 10;
 
		int totalCost = (int) (localCost + stdCost + isdCost);
 
		if (totalCost > budget) {
			return new int[]{1, totalCost - budget};
		} else {
			return new int[]{0, totalCost};
		}
	}
 
	public static void main(String[] args) {
		int[] callMinutes = {100, 100, 200};
		int budget = 1200;
 
		int[] result = calculateBill(callMinutes, budget);
		System.out.println("Output: {" + result[0] + "," + result[1] + "}");
	}
}
 
 
