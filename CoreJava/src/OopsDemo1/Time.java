package OopsDemo1;
/**
* Author:Paspunoori.Shankar
* Date  :26 Oct 2024
* Time  :3:18:48 pm
* Email :paspunoori.shankar@coforge.com
* 
* Java program to perform addition of 2 Times
 *  t1 --> 12 : 45 :55
 *  t2 --> 10 : 30 :30
 *         23   16 :25
 *  
 *     t1 + t2
 *     if sec> 60 .. mins should be incremented by 1 & sec -60 ,
 *     if min> 60  ... hrs should be incremented by 1 & min -60
*/
public class Time {
	private int hrs,min,sec;

	public Time(int hrs, int min, int sec) {
		this.hrs = hrs;
		this.min = min;
		this.sec = sec;
	}
	
	public void Add(Time obj ) {
		this.hrs+=obj.hrs;
		this.min+=obj.min;
		this.sec+=obj.sec;
		
		if(this.sec>60)
		{
			this.min+=1;
            this.sec-=60;
		}
		if(this.min>60)
		{
			this.hrs+=1;
			this.min-=60;
		}
		
	}
	
	
	
	public void display() {
		System.out.println("the addition of  time is :");
		System.out.println("H"+this.hrs+" M"+this.min+" S"+this.sec);

	}
	
	

}