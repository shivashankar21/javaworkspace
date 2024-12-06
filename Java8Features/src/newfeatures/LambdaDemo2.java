package newfeatures;
/**
* Author:Paspunoori.Shankar
* Date  :8 Nov 2024
* Time  :12:37:06 pm
* Email :paspunoori.shankar@coforge.com
*/
public class LambdaDemo2 {
	
	public static void main(String[] args) {
		
		//lambda expression 
		MyString reverseStr = (str)->{
			String result="";
			for(int i=str.length()-1;i>=0;i--)
				result+=str.charAt(i);
			return result;
			
		};
		System.out.println(reverseStr.myStringFunction("Lambda Expressions"));
		System.out.println(reverseStr.myStringFunction("madam"));
		System.out.println(reverseStr.myStringFunction("Hello World java"));
		
		//lambda Expression with single parameter
		
		MyString MyName = (name)-> {return"Hello "+name;};
		
		System.out.println(MyName.myStringFunction("Shiva"));
		
		MyString myName1 = name ->{ return "hello " +name;};
		
		System.out.println(myName1.myStringFunction("James Gosling"));
		
		MyString myName2 = name ->{ return "String length of "+name+" is " +name.length();};
		
		System.out.println(myName2.myStringFunction("nfjifdahrusnj"));


		
		
	}
}
