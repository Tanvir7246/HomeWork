package hw5Q3Constructor;

public class Student {
	public String stName;
	public int stID;
	public char sex;
	public boolean isProgrammer;
	public float grade;

	public Student() {
		System.out.println("Hi, I am Mr Default Constructor");
	}

	public Student(String stName, int stID, char sex, boolean isProgrammer, float grade) {
		super();
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		this.isProgrammer = isProgrammer;
		this.grade = grade;

		System.out.println("My name is:" + stName + "\nMy student id is:" + stID + "\nMy sex is:" + sex
				+ "\nI am a programmer.:" + isProgrammer + "\nMy Grade is:" + grade);
	}
}
