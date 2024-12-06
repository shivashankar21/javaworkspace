package jdbcdemo;
/**
* Author:Paspunoori.Shankar
* Date  :7 Nov 2024
* Time  :3:33:57 pm
* Email :paspunoori.shankar@coforge.com
*/
public class UpdateDemo {
	public static void main(String[] args) {
		
		
		Candidates c1=new Candidates();
		
		try {
			c1.getConnection();
			c1.UpdateCandidate();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
