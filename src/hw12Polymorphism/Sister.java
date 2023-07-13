package hw12Polymorphism;

/*
 * Method overloading- 
 * When two or more methods exist in a same class with different parameters, 
 * this is what we know as method overloading. */

public class Sister {

	public int age1;
	public int age2;
	public int age3;
	public String age4;
	public int age5;
	public int age6;

	public Sister() {
		System.out.println(" Defaut constructor");
	};

	public Sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		super();
		this.age1 = age1;
		this.age2 = age2;
		this.age3 = age3;
		this.age4 = age4;
		this.age5 = age5;
		this.age6 = age6;

		System.out.println(" First sister's age is " + age1 + "\n Second sister's age is " + age2
				+ " \n Third sister's age is " + age3 + " \n Fourth sister's age is " + age4
				+ " \n Fifth sister's age is " + age5 + " \n Sixth sister's age is " + age6);

	};

	public void sister(int age1, int age2) {

		System.out.println(" First sister's age is " + age1 + "\n Second sister's age is " + age2);
	};

	public int sister(int age3, int age5, int age6) {
		int total = (age3 + age5 + age6);
		System.out.println(" Total ages: " + total);
		return total;

	};

	public static int sister(int age1, int age6, int age3, int age5) {
		int total = (age1 + age6);
		System.out.println(" Total ages: " + total);
		return total;
	}

	final int sister(String age4, int age1) {
		int total = (Integer.parseInt(age4) + age1);
		System.out.println(" Total ages: " + total);
		return total;

	};

}
