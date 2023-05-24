package hw4JavaVariables;

public class AboutMeTest {
	public static void main(String[] args) {

		AboutMe tanvir = new AboutMe();
		tanvir.name = "Tanvir Mahamood";
		tanvir.age = 28;
		tanvir.ageGapWithFather = -40;
		tanvir.gpa = 4.22f;

		tanvir.aboutMe();
		
		System.out.println("\n.....................................\n");
		
		AboutMe alex = new AboutMe();
		alex.name = "Lokkhi Shona Alex";
		alex.age = 29;
		alex.ageGapWithFather = -45;
		alex.gpa = 4.69f;
		
		alex.aboutMe();
		System.out.println();
	}

}
