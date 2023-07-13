package hw12Abstraction;

public abstract class MedicalSchool  extends NursingSchool implements Lawschool {

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("Its a non-abstract method");

	};

//yes, default constructor is here.
	public MedicalSchool() {
	};
}
