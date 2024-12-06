package Assignment;
/**
* Author:Paspunoori.Shankar
* Date  :4 Nov 2024
* Time  :11:10:32 pm
* Email :paspunoori.shankar@coforge.com
*/
public class CommandLineOperations {


	public static void main(String[] args) {

		int num1,num2;
		String op;
		
		num1=Integer.parseInt(args[0]);	//Type Casting 
		op=args[1];
		num2=Integer.parseInt(args[2]);
		
int result;
switch(op) {
		
		case "+": result=num1+num2;
				  System.out.println("The Addition of "+num1+" and "+num2+" is "+result);
				  break;
		case "-": result=num1-num2;
		  		  System.out.println("The Subtraction of "+num1+" and "+num2+" is "+result);
		  		  break;
		case "*": result=num1*num2;
		  		  System.out.println("The Multiplicatio of "+num1+" and "+num2+" is "+result);
		  		  break;
		case "/": result=num1/num2;
		  		  System.out.println("Then Division of "+num1+" and "+num2+" is "+result);
		  		  break;
		case "%": result=num1%num2;
		  		  System.out.println("The Remainder of "+num1+" and "+num2+" is "+result);
		  		  break;
		default:  System.out.println("Invalid Operator");
		  		  break;
		
	}

}


}
