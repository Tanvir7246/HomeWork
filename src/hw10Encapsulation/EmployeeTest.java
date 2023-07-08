package hw10Encapsulation;

public class EmployeeTest {
	public static void main(String[] args) {

		Employee one = new Employee();

		one.setName("Tanvir Saimoon");
		one.setAge(28);
		one.setUsCitizen(true);

		System.out.println("My name is " + one.getName() + "\nMy age is " + one.getAge()
				+ "\nMy US citizenship status is " + one.isUsCitizen());
	}

}
