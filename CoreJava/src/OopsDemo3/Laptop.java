package OopsDemo3;
/**
* Author:Paspunoori.Shankar
* Date  :29 Oct 2024
* Time  :3:24:05 pm
* Email :paspunoori.shankar@coforge.com
*/
public class Laptop  extends  Item{
	
	public Laptop(String name, int price,String manufacturer) {
		super(name, price);
		this.manufacturer=manufacturer;
		
	}

	private String manufacturer;

	@Override
	void display() {
		super.display();
		System.out.println("Manufacturer          : " +manufacturer);
	}

}
