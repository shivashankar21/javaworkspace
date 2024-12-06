package OopsDemo2;
/**
* Author:Paspunoori.Shankar
* Date  :29 Oct 2024
* Time  :11:22:31 am
* Email :paspunoori.shankar@coforge.com
*/
class Hyundai extends Car{
	
	public  void hyundaiStart() {
		
		Engine heng = new Engine();
		heng.startEngine();
	}
}
class Maruthi extends Car{
	
	public void maruthiStart() {
		
		Engine meng= new Engine();
		meng.startEngine();
	}
	
}
public class CompositionDemo {
	
	public static void main(String[] args) {
		
		Maruthi baleno =new Maruthi();
		
		baleno.setColor("Silver"); //car class methods
		baleno.setMax_speed(180);	//car class methods
		
		System.out.println("*******Maruti Car Details *********");
		System.out.println(baleno.getColor() +" Color");//car class methods
		System.out.println(baleno.getMax_speed()+" Speed");//car class methods
		
		baleno.maruthiStart(); // Maruthi class method-- > call ENgine class method
		
		//baleno=null;// Baleno object got destroyed along with the engine object
		//System.gc();
		baleno.maruthiStart();
		System.out.println(baleno.getColor());
		
	}

}
