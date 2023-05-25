package hw3JavaBasics;



public class AboutMe {
	// Variable declared below.
	public String schoolName;

	// Variables initialized below.
	public String fullName = "Tanvir Mahamood Saimoon";
	public int age = 28;
	public char gender = 'M';
	public boolean bdCitizen = false;
	public byte ageGapWithFather = -40;
	public float gpa = 4.22f;
	public long debt = 5505200l;
	public double gpa2 = 4.2659855;
	public short ssn = 22569;
	
	public static void main(String[] args) { 
		// Class Instantiated
		AboutMe aboutMe = new AboutMe();
		System.out.println("My name is: " + aboutMe.fullName + "\nMy age is: " + aboutMe.age + "\nMy age gap with my father is: "
				+ aboutMe.ageGapWithFather  + "\nMy Gpa is: " + aboutMe.gpa); 
		
		
	  
		

		
		
	}

}
