package OopsDemo1;
/**
* Author:Paspunoori.Shankar
* Date  :26 Oct 2024
* Time  :4:13:14 pm
* Email :paspunoori.shankar@coforge.com
*/
public class LAnguage {
	
	private String name;
	private float version;
	
	public LAnguage() {
		this.name="Java";
		this.version=8.8f;
		System.out.println("The Language is :"+this.name +" -V"+this.version);
	}

	
	public LAnguage(String name) {
		this.name=name;
		this.version=5.0f;
		
	}
	
	public LAnguage(float version) {
		this.version=version;
		this.name="Python";
		System.out.println("The Language is :"+this.name +" -V" +this.version);
	}
	
	public LAnguage(String name, float version) {
		this.name=name;
		this.version=version;
		System.out.println("The Language is :"+this.name +" -V"+this.version);
	}
}
