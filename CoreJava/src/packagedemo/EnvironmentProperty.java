package packagedemo;
/**
* Author:Paspunoori.Shankar
* Date  :4 Nov 2024
* Time  :4:22:29 pm
* Email :paspunoori.shankar@coforge.com
*/
public class EnvironmentProperty {
	public static void main(String[] args) {
		
	      System.out.println(System.getProperty("java.class.path"));
	       System.out.println(System.getProperty("java.home"));
	       System.out.println(System.getProperty("java.class.version"));
	       System.out.println(System.getProperty("java.specification.vendor"));
	       System.out.println(System.getProperty("java.specification.version"));
	       System.out.println(System.getProperty("java.vendor"));
	       System.out.println(System.getProperty("java.vendor.url"));
	       System.out.println(System.getProperty("java.version"));
	       System.out.println(System.getProperty("java.vm.name"));

		//using runtime class method
	      
	       Runtime objRun= Runtime.getRuntime();
	       Process objProcess=null;
	       try {
	    	   objProcess=objRun.exec("notepad.exe");
	       }catch(Exception e) {
	    	   System.out.println("Error executing  Calculator");
	       }
	       
	}

}
