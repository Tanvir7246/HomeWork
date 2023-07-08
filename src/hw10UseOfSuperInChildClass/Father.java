package hw10UseOfSuperInChildClass;

public class Father {

	public String name;
	public String familyName;
	public int age;
	public boolean UsCitizen;

	public Father() {
		System.out.println("Hi, I am default constructor");

	}

	public Father(String name, String familyName, int age, boolean usCitizen) {

		this.name = name;
		this.familyName = familyName;
		this.age = age;
		UsCitizen = usCitizen;

		System.out.println("Hi my father name is " + this.name + "\nMy family name is " + this.familyName
				+ "\nMy age is " + this.age + "\nMy fater is a A us citizen " + UsCitizen);
	}

	public void father() {
		System.out.println("I am void father method");
	};

	public void fatherInfo(String name, String familyName, int age, boolean usCitizen) {
		this.name = name;
		this.familyName = familyName;
		this.age = age;
		UsCitizen = usCitizen;

		System.out.println("Hi my father name is " + this.name + "\nMy family name is " + this.familyName
				+ "\nMy age is " + this.age + "\nMy fater is a A us citizen " + UsCitizen);

	};
}
