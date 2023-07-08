
/*Now, Daughter extends Father (superclass).
 *  Use the super method, and super keyword and show all of their use in the child class.
 *   Use 'FamilyName' variable (from the parent class) to initialize by super keyword in the 
 *   child class (Use one constructor and one method to implement them) and initialize in a TestFamily Class. 
 *   Paste the GitHub link below.  */

package hw10UseOfSuperInChildClass;

public class Daughter extends Father {

	public String birthMonth;
	public int age;

	public Daughter() {
		super();
		super.father();
		super.fatherInfo("A", "G", 25, true);
		super.familyName = "G";

		System.out.println("I am a default constructor from daughter class");
	}

	public Daughter(String birthMonth, int age) {

		this.birthMonth = birthMonth;
		this.age = age;

		System.out.println("Birthmonth is " + this.birthMonth + "Age is " + this.age);
	};

	public void daughter() {
		System.out.println("A regular method from daughter class");
	};

	public void daughterInfo(String birthMonth, int age) {

		super.father();
		super.fatherInfo("A", "G", 25, true);
		this.birthMonth = birthMonth;
		this.age = age;

		System.out.println("Birthmonth is " + this.birthMonth + "Age is " + this.age);
	};

}
