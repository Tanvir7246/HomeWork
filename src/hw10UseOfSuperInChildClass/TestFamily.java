package hw10UseOfSuperInChildClass;

public class TestFamily {
	public static void main(String[] args) {

		Father baba = new Father();
		
		Father baba2 = new Father("Abul", "Habul", 25, true);
		baba.father();
		baba.fatherInfo("Abul", "Habul", 25, true);
		
		Daughter daughter = new Daughter();
		
		Daughter daughter2 = new Daughter();
		
		daughter.daughter();
		
		daughter.daughterInfo("January", 29);

	}

}
