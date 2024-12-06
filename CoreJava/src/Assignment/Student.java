package Assignment;
/**
 * Author:Paspunoori.Shankar
 * Date  :28 Oct 2024
 * Time  :1:10:53 am
 * Email :paspunoori.shankar@coforge.com
 */
public class Student {

	// Private fields for encapsulation
	private String name;
	private int yearOfJoining;
	private double salary;
	private String address;

	// Constructor to initialize the student object
	public Student(String name, int yearOfJoining, double salary, String address) {
		this.name = name;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
		this.address = address;
	}

	// Getter methods for accessing private fields
	public String getName() {
		return name;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public String getAddress() {
		return address;
	}

	// Method to display student information
	public void displayInfo() {
		System.out.printf("%-10s %-15d %-10s %-15s%n", name, yearOfJoining, salary, address);
	}
}


