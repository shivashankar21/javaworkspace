package genericsdemo;
/**
* Author:Paspunoori.Shankar
* Date  :5 Nov 2024
* Time  :11:24:05 am
* Email :paspunoori.shankar@coforge.com
*/

class Sample<T>{
	private T data;

	public Sample(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
	
}
public class GenericClassDemo {
	
	public static void main(String[] args) {
		
		Sample<String> s1= new Sample<String>("Java Generics");
		
		System.out.println("Display from generic class by passing String Object:"+s1.getData());
		
		Sample<Integer> s2= new Sample<Integer>(200);
		
		System.out.println("Display from generic class by passing Integer Object:"+s2.getData());
		
		Sample<Double> s3= new Sample<Double>(555.50);
		
		System.out.println("Display from generic class by passing Double Object:"+s3.getData());


		
		
	}
	

}