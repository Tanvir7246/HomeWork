package hw11Abstraction.copy;

public abstract class MedicalSchool {

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("Its a non-abstract method");

	};

//yes, default constructor is here.
	public MedicalSchool() {
	};
}
