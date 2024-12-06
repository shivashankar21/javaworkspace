package newfeatures;
/**
* Author:Paspunoori.Shankar
* Date  :8 Nov 2024
* Time  :12:24:41 pm
* Email :paspunoori.shankar@coforge.com
*/
public class LambdaDemo1 {
	public static void main(String[] args) {
		
		NumericTest isEven =(n) -> (n%2==0);
		NumericTest isNegative =(n)->(n<0);
		
		System.out.println("7is Even NUmber :"+isEven.computeTest(7));
		System.out.println("-55 is Negative NUmber :"+isNegative.computeTest(7));

		//boolean a=(n) -> (n%2==0);
		// error -lamba expressions shoulb be stored in instance of F1
	}

}
