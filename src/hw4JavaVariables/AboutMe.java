package hw4JavaVariables;

public class AboutMe {
	public String name;
	public int age;
	public byte ageGapWithFather;
	public short id;
	public float gpa;
	public char firstLetter;
	public boolean citizen;
	public long balance;
	public double gpa2;

	// Constructor
	public AboutMe() {
		System.out.println("This is all about us");

	}

	// Method
	public void aboutMe() {
		System.out.println(
				"My name is: " + name + " \nMy age is:" + age 
				+"\nMy age Gap with my father is:" 
				+ ageGapWithFather
				+ "\nMy gpa is: " + gpa + "\nMy id is: " + id 
				+ "\nFirst letter of my name is: " + firstLetter);

	}
}
