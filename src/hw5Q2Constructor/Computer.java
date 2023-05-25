package hw5Q2Constructor;

public class Computer {
	public String brand;
	public int model;
	public int price;
	public char grade;
	public boolean madeInUSA;

//Default Constructor declared.
	public Computer() {
		System.out.println("Hi... I am the 'Default Constructor' ");
	}

// Parameterized Constructor declared.
	public Computer(String brand, int model, int price, char grade, boolean madeInUSA) {
		this.brand = brand;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("My Brand: " + brand + ", \nModel: " + model + ", \nPrice: $" + price + ", \nGrade: " + grade
				+ ", \nand Made in the USA? Ans: " + madeInUSA);
	}

}
