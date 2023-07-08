package hw10Encapsulation;

public class Employee {

	private String Name;
	private int Age;
	private char Sex;
	private boolean UsCitizen;

	public String getName() {
		return Name;
	}

	public int getAge() {
		return Age;
	}

	public char getSex() {
		return Sex;
	}

	public boolean isUsCitizen() {
		return UsCitizen;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setAge(int age) {
		Age = age;
	}

	public void setSex(char sex) {
		Sex = sex;
	}

	public void setUsCitizen(boolean usCitizen) {
		UsCitizen = usCitizen;
	}

}
