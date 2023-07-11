package hw9Abstraction;

public abstract class MedicalSchool {

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println(" Its a non-abstract method");

	};

//yes, default constructor is here.
	public MedicalSchool() {
	};
}
