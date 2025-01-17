package genericsdemo;
/**
 * Author:Paspunoori.Shankar
 * Date  :5 Nov 2024
 * Time  :11:47:09 am
 * Email :paspunoori.shankar@coforge.com
 */
//generic class with single parameter - ArrayList ,vector , HashSet
public class Container<T> {

	private T t;
	//method 
	public void add(T t) {
		this.t=t;

	}
	// generate getter method 
	public T get() {
		return t;
	}
	
	public static void main(String[] args) {
		Container<String> strContainer=new Container<String>();
		Container<Integer> intContainer=new Container<Integer>();
		Container<Double> dblContainer=new Container<Double>();
		Container<Character> chrContainer=new Container<Character>();
		
		strContainer.add("James Gosling");
		intContainer.add(1000);
		dblContainer.add(50000.55);
		chrContainer.add('A');
		
		System.out.println("The String Value is :"+strContainer.get());
		System.out.println("The Integer Value is :"+intContainer.get());
		System.out.println("The Double Value is :"+dblContainer.get());
		System.out.println("The Character Value is :"+chrContainer.get());
	}


}
