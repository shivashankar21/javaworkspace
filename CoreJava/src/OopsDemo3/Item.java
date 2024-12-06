package OopsDemo3;
/**
 * Author:Paspunoori.Shankar
 * Date  :29 Oct 2024
 * Time  :3:22:09 pm
 * Email :paspunoori.shankar@coforge.com
 */
//Dynamic Polymorphism - UpCasting Demo

public class Item {

	private String name;
	private int price;


	public Item(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	void display() {
		System.out.println("********** Item Details ***************");
		System.out.println("Name         : "+name);
		System.out.println("Price        : "+price);
	}

}
