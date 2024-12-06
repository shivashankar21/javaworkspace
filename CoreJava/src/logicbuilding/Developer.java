package logicbuilding;
/**
* Author:Paspunoori.Shankar
* Date  :15 Nov 2024
* Time  :11:42:22 pm
* Email :paspunoori.shankar@coforge.com
*/


 
public class Developer extends Employee{
	
    private String programmingLanguage;
    
    // Constructor for Developer
    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }
 
    // Getter for programming language
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
 
    // Overridden method to include programming language in the details
    @Override
    public String getDetails() {
        return super.getDetails() + ", Programming Language: " + programmingLanguage;
    }
}
 

