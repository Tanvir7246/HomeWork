package hw12Polymorphism;

/* Method overriding - When a method with same name and same parameters exist in both parent-class and child-class.
 * Its not possible to override static and final types of methods.
 * */

public class Niece extends Sister {

	@Override
	public void sister(int age1, int age2) {
		// TODO Auto-generated method stub
		super.sister(age1, age2);
	}

	@Override
	public int sister(int age3, int age5, int age6) {
		// TODO Auto-generated method stub
		return super.sister(age3, age5, age6);
	}

}
